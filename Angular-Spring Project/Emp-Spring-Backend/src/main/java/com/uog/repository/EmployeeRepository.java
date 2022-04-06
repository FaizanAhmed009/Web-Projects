package com.uog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uog.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
