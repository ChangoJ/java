package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// esto es un comentario
		
		Persona p; //variable p tipo persona
		p = new Persona(); //intanaciar un objero
		
		Persona p2; //variable p tipo persona
		p2 = new Persona(); //intanaciar un objero
		
		p.nombre = "Maria";
		p.edadPersona =45;
		p.estatura = 1.56;
		
		System.out.println("Nombre "+ p.nombre);
		System.out.println("Edad "+ p.edadPersona);
		System.out.println("Estatura "+ p.estatura);
		
		
		p2.nombre = "Juan";
		p2.edadPersona =22;
		p2.estatura = 1.76;
		
		System.out.println("Nombre "+ p2.nombre);
		System.out.println("Edad "+ p2.edadPersona);
		System.out.println("Estatura "+ p2.estatura);
		
	}

}
