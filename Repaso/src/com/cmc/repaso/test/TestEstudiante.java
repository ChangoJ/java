package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante estudiante = new Estudiante("Marco");
		
		estudiante.calificar(20);
		;
	}

}
