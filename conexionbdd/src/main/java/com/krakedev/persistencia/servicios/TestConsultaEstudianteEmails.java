package com.krakedev.persistencia.servicios;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Estudiante;
import com.krakedev.persistencia.entidades.Persona;

public class TestConsultaEstudianteEmails {
	public static void main(String[] args) {
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

		try {
			estudiantes = AdminEstudiantes.buscarPorEmail("gmail");
			System.out.println(estudiantes);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
