package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarma {

	public static void main(String[] args) {
		Alarma alarma = new Alarma(DiasSemana.MARTES, 1, 30);
		Alarma alarma2 = new Alarma(DiasSemana.MIERCOLES, 6, 40);
		Alarma alarma3 = new Alarma(DiasSemana.LUNES, 7, 50);
		AdminAlarmas adminAlarma = new AdminAlarmas();
		
		adminAlarma.agregarAlarma(alarma);
		adminAlarma.agregarAlarma(alarma2);
		adminAlarma.agregarAlarma(alarma3);
	
		ArrayList<Alarma> alarmasActuales = adminAlarma.getAlarmas();
		System.out.println(alarmasActuales);
	}

}
