package net.javaguides.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
