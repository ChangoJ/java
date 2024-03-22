package com.cmc.repaso.test;

<<<<<<< HEAD
public class TestValidacion {
	public static void main(String[] args) {
		
	}
=======
import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion validacion = new Validacion();
		
		System.out.println(validacion.validarMonto(-20));
		System.out.println(validacion.validarMonto(20));
	}

>>>>>>> fdb198a4350df93e09ca5dcd809b272037d5a476
}
