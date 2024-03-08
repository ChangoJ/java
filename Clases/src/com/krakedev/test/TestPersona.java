package com.krakedev.test;

import com.krakedev.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// esto es un comentario
		
		Persona p; //variable p tipo persona
		p = new Persona("Maria",45,1.56); //intanaciar un objero
		
		Persona p2; //variable p tipo persona
		p2 = new Persona("Juan",22,1.76); //intanaciar un objero
		
        
		System.out.println("Nombre: " + p.getNombre());
        System.out.println("Edad: " + p.getEdadPersona());
        System.out.println("Estatura: " + p.getEstatura());
		
		
        
		
		System.out.println("Nombre: " + p2.getNombre());
        System.out.println("Edad: " + p2.getEdadPersona());
        System.out.println("Estatura: " + p2.getEstatura());
		
	}

}
