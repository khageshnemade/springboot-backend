package com.cdac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.exception.ResourceNotFound;
import com.cdac.model.Employee;
import com.cdac.repo.EmployeeRepo;

@CrossOrigin
@RestController
@RequestMapping("/e")
public class EmployeeController {
	@Autowired private EmployeeRepo erepo;

	@GetMapping
	public List<Employee> getAll(){
		
		return erepo.findAll();
	}
	
	@PostMapping
	public Employee createEmployee(@RequestBody Employee emp) {
		return erepo.save(emp);
	}
	
	//Get Employee by Id Rest API
	@GetMapping("{id}")
	 public ResponseEntity<Employee> getEmployeeById(@PathVariable  long id){
		Employee emp=erepo.findById(id).orElseThrow(()->{return new ResourceNotFound("Not Foung Id:"+id);});
		return ResponseEntity.ok(emp);
	}
	
	
	//Update Employee By using Id
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee emp){
		Employee updateEmployee=erepo.findById(id).orElseThrow(()->new ResourceNotFound("Not Foung Id:"+id));
		updateEmployee.setEmailId(emp.getEmailId());
		updateEmployee.setFirstName(emp.getFirstName());
		updateEmployee.setLastName(emp.getLastName());
		erepo.save(updateEmployee);
		return ResponseEntity.ok(updateEmployee);
	}
	
	
	//Delete Employee Rest Call
	@DeleteMapping("{id}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id){
		Employee emp=erepo.findById(id).orElseThrow(()->new ResourceNotFound("Not Foung Id:"+id));
		erepo.delete(emp);
		return ResponseEntity.ok(HttpStatus.NO_CONTENT);
	}
}
