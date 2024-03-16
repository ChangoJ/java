package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos = new ArrayList<Telefono>();
	
	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}
	
	public void mostrarTelefonos() {
		System.out.println("Telefonos con estado 'C'");
		
		for (Telefono telefono : telefonos) {
			if(telefono.getEstado().equalsIgnoreCase("C")) {
				System.out.println("Numero: "+telefono.getNumero()+", Tipo: "+telefono.getTipo());
			}
				
		}
	}
	
	public ArrayList<Telefono> recuperarIncorrectos(){
		ArrayList<Telefono> telefonosIncorrectos = new ArrayList<Telefono>();
		
		for (Telefono telefono : telefonos) {
			if(telefono.getEstado().equalsIgnoreCase("E")) {
				telefonosIncorrectos.add(telefono);
			}
				
		}
		
		return telefonosIncorrectos;
	}
	
	
	public void imprimir() {
		System.out.println("***"+this.nombre+" "+this.apellido+"***");
		if(direccion !=null) {
			System.out.println("Direccion: "+this.direccion.getCallePrincipal()+" y "+this.direccion.getCalleSecundaria());
			
		}else {
			System.out.println("No tiene asociada una direccion");
		}
		
		
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

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	
	
	
	
	
}
