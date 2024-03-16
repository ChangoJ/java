package com.krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

	
	
	public String buscarEstudiantePorCedula(Estudiante estudiante) {
		boolean verificador = false;
		String mensajeRetorno ;
		for (Estudiante itemEstudiante : estudiantes) {
			if(itemEstudiante.getCedula().equals(estudiante.getApellido())) {
				verificador = true;
			}
		}
		
		if(verificador) {
			mensajeRetorno = "Si existe";
			return mensajeRetorno;
		}else {
			return null;
		}
		
	}
	
	public void matricularEstudiante(Estudiante estudiante) {
		String mensaje;
		
		mensaje = buscarEstudiantePorCedula(estudiante);
		
		if(mensaje == null) {
			estudiantes.add(estudiante);
		}else {
			System.out.println("Ya existe el estudiante");
		}
	}
	
	public double calcularPromedioCurso() {
		double suma = 0;
		double promedio;
		
		for (Estudiante estudiante : estudiantes) {
			suma += estudiante.calcularPromedioNotasEstudiante();
		}
		
		promedio = suma/estudiantes.size();
		
		return promedio;
	}
	
	public void mostrar() {
		String informacion = "";
		int contador = 1;
		for (Estudiante estudiante : estudiantes) {
			informacion +="\n"+contador+".- Nombre: "+estudiante.getNombre()+", Apellido: "+estudiante.getApellido()+", Cedula: "+ ""
					+ estudiante.getCedula()+" Nota: "+estudiante.getNotas().getFirst().getCalificacion();
			contador++;
		}
		
		System.out.println(informacion);
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	
	
	
}
