package com.victor.docemonos.modelos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Employee
 */
@Entity
@Data
@AllArgsConstructor
public class Employee {

    public Employee() {}

    public Employee(int i, String string, String string2, Date date) {
        this.id = i;
        this.nombre = string;
        this.apellido = string2;
        this.fecha = date;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
    private String nombre;
    private String apellido;
    private Date fecha;

    public Integer getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}