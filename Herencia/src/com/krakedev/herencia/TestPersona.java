package com.krakedev.herencia;

public class TestPersona {
	public static void main(String[] args) {
		Persona persona = new Persona("17268577441", "Sara");
		System.out.println(persona.toString());

		Cuenta cuenta = new Cuenta("1234567890", 1000.0);

		System.out.println(cuenta.toString());

	}
}
