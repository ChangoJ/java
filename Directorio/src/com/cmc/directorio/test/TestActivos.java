package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {
	public static void main(String[] args) {
		
		Telefono telefono = new Telefono("Claro", "097634234", 4);
		Contacto contacto = new Contacto("Realme", telefono, 2.1);
		
		AdminContactos adminContactos = new AdminContactos();
		
		adminContactos.activarUsuario(contacto);
		
		System.out.println("Información del contacto: \nNombre: " + contacto.getNombre() + "\nTeléfono: Operadora: " + contacto.getTelefono().getOperadora() + "\n"
				+ "Número: " + contacto.getTelefono().getNumero() + "\nCodigo: " + contacto.getTelefono().getCodigo() + "\nPeso: " + contacto.getPeso()+ "\n"
						+ "Activo: "+contacto.isActivo());

		
	}
}
