package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminPersona {
	public static void main(String[] args) {
		EstadoCivil estadoCivil = new EstadoCivil("U","Union Libre");
		Persona persona = new Persona("1026850887","Julio","Jaramillo",estadoCivil);
		try {
			Date fechaNacimiento = Convertidor.convertirFecha("2000/08/15");
			Date horaNacimiento = Convertidor.convertirHora("9:23");
			
			persona.setFechaNacimiento(fechaNacimiento);
			persona.setHoraNacimiento(horaNacimiento);
			persona.setCantidadAhorrada(new BigDecimal(1230.45));
			persona.setNumeroHijos(50);
			AdminPersonas.insertar(persona);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error en el sistema: "+e.getMessage());
		}
		
		
	}
}
