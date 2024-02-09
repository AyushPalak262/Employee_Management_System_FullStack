package com.employee.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.manage.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
