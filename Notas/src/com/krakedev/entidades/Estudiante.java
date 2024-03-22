package com.krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas = new ArrayList<Nota>();
	
	public Estudiante(String cedula, String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
	}
	
	public void agregarNota(Nota nuevaNota) {
		if( notas.isEmpty() && (nuevaNota.getCalificacion() >=0 && nuevaNota.getCalificacion() <=10)) {
			notas.add(nuevaNota);
		}else {
			for (Nota nota : notas) {
				if(!nota.getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo()) && (nuevaNota.getCalificacion() >=0 && nuevaNota.getCalificacion() <=10) ) {
					notas.add(nuevaNota);
					break;
				}
			}
		}
		
	}
	
	public void modificarNota(String codigo, double nuevaNota) {
		boolean verificador = false;
		for (Nota nota : notas) {
			if(nota.getMateria().getCodigo().equals(codigo) && (nuevaNota >=0 && nuevaNota <=10) ) {
				verificador = true;
				nota.setCalificacion(nuevaNota);
			}
		}
		
		if(!verificador) {
			System.out.println("No se encontro la Materia");
		}
	}
	

	public double calcularPromedioNotasEstudiante() {
		double promedio;
		double suma = 0;
		for (Nota nota : notas) {
			suma += nota.getCalificacion();
		}
		
		promedio = suma/notas.size()+1;
		
		return promedio;
	}
	
	public void mostrar() {
		String informacion = "";
		
		informacion += "\nNombre: "+this.nombre+", Apellido: "+this.apellido+", cedula: "+this.cedula;
		for (Nota nota : notas) {
			informacion +=" \nMateriaCodigo: "+nota.getMateria().getCodigo()+", NombreMateria: "+nota.getMateria().getNombre();
		}
		
		System.out.println(informacion);
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	
	
	
	
	
}
