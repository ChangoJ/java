package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {
	public static void main(String[] args) {
		int cantidadTldsClaro;
		
		Telefono telefono = new Telefono("Movi", "098234234", 20);
		Telefono telefono2 = new Telefono("Claro", "098879450", 17);
		Telefono telefono3 = new Telefono("Movi", "098562131", 15);
		Telefono telefono4 = new Telefono("Claro", "098562131", 15);

		AdminTelefono adminTelefono = new AdminTelefono();

		cantidadTldsClaro = adminTelefono.contarClaro(telefono, telefono2, telefono3, telefono4);
		
		System.out.println("Numeros de claro: "+cantidadTldsClaro);
	
	}
}
