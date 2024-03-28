package com.krakedev.persistencia.servicios;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;

public class TestConsultaEstaturaPersona {
	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<Persona>();

		try {
			personas = AdminPersonas.buscarPorEstatura(1.70);
			System.out.println(personas);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
