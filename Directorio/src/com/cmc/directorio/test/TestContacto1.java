package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telefono = new Telefono("Movi", "098234234", 20);
		Contacto contacto = new Contacto("Realme", telefono, 2.1);
		
		
		System.out.println("Información del contacto: \nNombre: " + contacto.getNombre() + "\nTeléfono: Operadora: " + contacto.getTelefono().getOperadora() + "\n"
				+ "Número: " + contacto.getTelefono().getNumero() + "\nCodigo: " + contacto.getTelefono().getCodigo() + "\nPeso: " + contacto.getPeso());

		
		
		
	}

}
