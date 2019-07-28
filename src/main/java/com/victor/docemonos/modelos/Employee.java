package com.victor.docemonos.modelos;

import java.util.Date;

/**
 * Employee
 */
public class Employee {

    public Employee(int i, String string, String string2, Date date) {
        this.id = i;
        this.nombre = string;
        this.apellido = string2;
        this.fecha = date;
	}
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