package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion validacion = new Validacion();
		
		System.out.println(validacion.validarMonto(-20));
		System.out.println(validacion.validarMonto(20));
	}

}
