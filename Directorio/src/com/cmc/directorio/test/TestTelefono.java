package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {
	public static void main(String[] args) {
		Telefono telefono = new Telefono("Movi", "09941234123", 10);
		
		System.out.println("Información del teléfono: \nOperadora: " + telefono.getOperadora() + "\n"
				+ "Número: " + telefono.getNumero() + "\nCodigo: " + telefono.getCodigo());
		   
		
	}
}
