package com.cdac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cdac.model.Employee;
import com.cdac.repo.EmployeeRepo;

@SpringBootApplication
public class EmployeeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@Autowired private EmployeeRepo empRepo;
	@Override
	public void run(String... args) throws Exception {
		//empRepo.save(new Employee("Khagesh","Nemade","khageshnemade@gmail.com"));
//		empRepo.save(new Employee("sunil","Nemade","sunilnemade@gmail.com"));
		
	}

}

