package com.krakedev.persistencia.entidades;

import java.util.Date;

public class Estudiante {
	private String cedula;
	private String nombre;
	private String apellido;
	private String email;
	private Date fechaNacimiento;
	private Profesor codigoProfesor;
	
	public Estudiante(String cedula, String nombre, String apellido, String email, Date fechaNacimiento,
			Profesor codigoProfesor) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.codigoProfesor = codigoProfesor;
	}

	public Estudiante() {
		// TODO Auto-generated constructor stub
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Profesor getCodigoProfesor() {
		return codigoProfesor;
	}

	public void setCodigoProfesor(Profesor codigoProfesor) {
		this.codigoProfesor = codigoProfesor;
	}

	@Override
	public String toString() {
		return "Estudiante [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", fechaNacimiento=" + fechaNacimiento + ", codigoProfesor=" + codigoProfesor + "]";
	}
	
	
	
	
	
}
