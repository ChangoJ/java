package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// esto es un comentario
		
		Persona p; //variable p tipo persona
		p = new Persona(); //intanaciar un objero
		
		Persona p2; //variable p tipo persona
		p2 = new Persona(); //intanaciar un objero
		
		p.setNombre("Maria");
        p.setEdadPersona(45);
        p.setEstatura(1.56);
        
		System.out.println("Nombre: " + p.getNombre());
        System.out.println("Edad: " + p.getEdadPersona());
        System.out.println("Estatura: " + p.getEstatura());
		
		
        p2.setNombre("Juan");
        p2.setEdadPersona(22);
        p2.setEstatura(1.76);
		
		System.out.println("Nombre: " + p2.getNombre());
        System.out.println("Edad: " + p2.getEdadPersona());
        System.out.println("Estatura: " + p2.getEstatura());
		
	}

}
