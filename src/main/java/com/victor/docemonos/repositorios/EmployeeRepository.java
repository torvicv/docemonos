package com.victor.docemonos.repositorios;

import com.victor.docemonos.modelos.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * EmployeeRepository
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

    
}