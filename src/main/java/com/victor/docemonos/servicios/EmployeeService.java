package com.victor.docemonos.servicios;

import java.util.List;
import java.util.Optional;

import com.victor.docemonos.modelos.Employee;
import com.victor.docemonos.repositorios.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * EmployeeService
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee guardar(Employee empleado) {
        return employeeRepository.save(empleado);
    }

    public Optional<Employee> findById(Integer id) {
        return employeeRepository.findById(id);
    }

    public void deleteById(Integer id) {
        employeeRepository.deleteById(id);
    }

    public List<Employee> showAll() {
        return employeeRepository.findAll();
    }

}