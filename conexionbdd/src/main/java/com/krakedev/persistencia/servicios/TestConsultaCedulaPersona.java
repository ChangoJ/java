package com.krakedev.persistencia.servicios;



import com.krakedev.persistencia.entidades.Persona;

public class TestConsultaCedulaPersona {
	public static void main(String[] args) {
		
		Persona persona = null;
		try {

			persona = AdminPersonas.buscarPorCedula("1026850887");
			System.out.println(persona);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
;	}
}
