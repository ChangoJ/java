package com.krakedev.persistencia.servicios;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;

public class TestConsultasPersonas {
	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<Persona>();

		try {
			personas = AdminPersonas.buscarPorNombre("a");
			System.out.println(personas);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
