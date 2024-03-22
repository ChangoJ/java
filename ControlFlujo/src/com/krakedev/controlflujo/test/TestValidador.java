package com.krakedev.controlflujo.test;

import com.krakedev.controlflujo.Validador;

public class TestValidador {

	public static void main(String[] args) {
		Validador validador = new Validador();
		
		validador.validarEdad(20);
		validador.validarEdad(15);
		validador.validarEdad(9);
		validador.validarEdad(60);
		validador.validarEdad(18);
	}


}
