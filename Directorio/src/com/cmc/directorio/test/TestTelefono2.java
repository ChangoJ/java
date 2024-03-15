package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {
	public static void main(String[] args) {
		Telefono telefono = new Telefono("Movi", "098234234", 20);
		
		AdminTelefono adminTelefono = new AdminTelefono();
		adminTelefono.activarMensajeria(telefono);
		
		System.out.println("Información del teléfono: \nOperadora: " + telefono.getOperadora() + "\n" + "Número: "
				+ telefono.getNumero() + "\nCodigo: " + telefono.getCodigo()+"\n"
						+ "Tiene Whatsapp: "+telefono.isTieneWhatsapp());

	}
}
