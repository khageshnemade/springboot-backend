package com.cdac.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
