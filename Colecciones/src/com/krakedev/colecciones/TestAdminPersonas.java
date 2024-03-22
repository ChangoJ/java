package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		Persona persona;
		ArrayList<Persona> mayores = new ArrayList<Persona>();
		AdminPersonas adminPersona = new AdminPersonas();
		
		adminPersona.agregar(new Persona("Camila", "Sosa",25));
		adminPersona.agregar(new Persona("Henry", "as",45));
		adminPersona.agregar(new Persona("Bryan", "as",28));
		adminPersona.agregar(new Persona("Nubia", "as",65));
		adminPersona.imprimir();
		
		persona = adminPersona.buscarPorNombre("Bryan");
		if(persona != null) {

			System.out.println("Encontrado: "+persona.getEdad());
		}else {
			System.out.println("No encontrado");
		}
		
		mayores = adminPersona.buscarMayores(60);
		System.out.println("Cantidad: " + mayores.size());
		
		Persona itemMayores;
		for (int i = 0; i < mayores.size(); i++) {
			itemMayores = mayores.get(i);
			System.out.println(itemMayores.getNombre()+" "+itemMayores.getEdad());
		}
		
	}

}
