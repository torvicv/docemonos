package com.victor.docemonos.controladores;

import java.util.Date;
import java.util.List;

import com.victor.docemonos.modelos.Employee;
import com.victor.docemonos.servicios.EmployeeService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

/**
 * RestController
 */
@RestController
@Log4j2
@RequestMapping("/employee")
public class BDController {


    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/showAll")
    public ResponseEntity<List<Employee>> showEmployee() {
       return ResponseEntity.ok(employeeService.showAll());
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {

        return ResponseEntity.ok(employeeService.guardar(employee));   

    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
        final Logger logger2 = LoggerFactory.getLogger(BDController.class);
        
        if (!employeeService.findById(id).isPresent()) {
            logger2.error("Id " + id + " not exists.");

            ResponseEntity.badRequest().build();
        }
        
        return ResponseEntity.ok(employeeService.guardar(employee));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteEmployee(@PathVariable Integer id) {
        final Logger logger2 = LoggerFactory.getLogger(BDController.class);
        
        if (!employeeService.findById(id).isPresent()) {
            logger2.error("Id " + id + " not exists.");

            ResponseEntity.badRequest().build();
        }

        employeeService.deleteById(id);

        return ResponseEntity.ok().build();
    }
}