package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {
	public static void main(String[] args) {
		Contacto contactoVerificador;
		boolean contactoBolean;
		
		Telefono telefono = new Telefono("Movi", "098234234", 20);
		Contacto contacto = new Contacto("Realme", telefono, 2.1);
		Telefono telefono2 = new Telefono("Claro", "09087561", 18);
		Contacto contacto2 = new Contacto("Xiamoi", telefono2, 3);
		
		AdminContactos adminContactos = new AdminContactos();
		contactoVerificador = adminContactos.buscarMasPeso(contacto, contacto2);
		
		System.out.println("El contacto con mayor valor es: "+contactoVerificador.getPeso());
		
		contactoBolean = adminContactos.compararOperadores(contacto, contacto2);
		
		System.out.println(contactoBolean);
		
	}
}
