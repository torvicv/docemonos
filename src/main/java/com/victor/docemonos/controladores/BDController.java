package com.victor.docemonos.controladores;

import java.util.Date;

import com.victor.docemonos.modelos.Employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController
 */
@RestController
@RequestMapping("/employee")
public class BDController {

    @GetMapping("/add")
    public Employee addEmployee() {
        Date today = new Date();

        Employee miEmpleado = new Employee(7, "Pepe", "Garcia", today);

        return miEmpleado;
    }
}