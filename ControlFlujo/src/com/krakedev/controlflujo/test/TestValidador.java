package com.krakedev.controlflujo.test;

import com.krakedev.controlflujo.Validador;

public class TestValidador {

	public static void main(String[] args) {
		Validador validador = new Validador();
		
		validador.ValidarEdad(30);
		validador.ValidarEdad(17);
		validador.ValidarEdad(5);
	}

}
