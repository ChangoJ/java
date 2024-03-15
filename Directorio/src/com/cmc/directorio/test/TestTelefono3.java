package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {
	public static void main(String[] args) {
		int cantidadTldsMovi;
		
		Telefono telefono = new Telefono("Movi", "098234234", 20);
		Telefono telefono2 = new Telefono("Claro", "098879450", 17);
		Telefono telefono3 = new Telefono("Movi", "098562131", 15);

		AdminTelefono adminTelefono = new AdminTelefono();

		cantidadTldsMovi = adminTelefono.contarMovi(telefono, telefono2, telefono3);
		
		System.out.println("Numeros de movi: "+cantidadTldsMovi);
		
	}
}
