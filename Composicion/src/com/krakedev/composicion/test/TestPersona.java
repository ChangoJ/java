package com.krakedev.composicion.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona persona = new Persona();
		persona.setNombre("Ever");
		persona.setApellido("Rosero");
		Direccion direccion = new Direccion();
		direccion.setCallePrincipal("Giovani calles");
		direccion.setCalleSecundaria("Cacha");
		direccion.setNumero("S/N");
		persona.setDireccion(direccion);
		String nombre = persona.getNombre();
		Direccion direccionp = persona.getDireccion();
		
		System.out.println("Nombre: "+nombre);
		System.out.println(nombre);
		//direccion esta null y trato de invocar a un metodo con esa variable
		System.out.println(direccionp.getCallePrincipal());
							//null.algunMetodo()
		persona.imprimir();
		
		Persona persona2 = new Persona();
		Direccion direccion2 = new Direccion("Zaval", "Juan san", "SN");
		persona2.setNombre("Ever");
		persona2.setDireccion(direccion2);
		persona2.imprimir();
		
		
		Persona persona3 = new Persona();
		persona3.setNombre("Ever");
		persona3.setDireccion(new Direccion("GDFD", "ASDA","4545"));
		persona3.imprimir();
		
		
	}

}
