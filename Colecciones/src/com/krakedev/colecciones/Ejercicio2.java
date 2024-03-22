package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {
	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		/*Persona persona = new Persona("Katty", "Salinas");
		Persona persona2 = new Persona("Ever", "Rosero");
		Persona persona3 = new Persona("Sara", "Vlez");
		personas.add(persona);
		personas.add(persona2);
		personas.add(persona3);*/
		 
		personas.add(new Persona("Katty", "Salinas",28));
		personas.add(new Persona("Ever", "Rosero",24));
		personas.add(new Persona("Sara", "Vlez",20));
		
		System.out.println(personas.size());
		
		Persona itemPersona;
		for (int i = 0; i < personas.size(); i++) {
			itemPersona = personas.get(i);
			System.out.println(itemPersona.getNombre()+" - "+itemPersona.getApellido());
			
		}
	}
}
