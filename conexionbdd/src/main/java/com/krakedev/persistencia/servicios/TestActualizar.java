package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Estudiante;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.entidades.Producto;
import com.krakedev.persistencia.entidades.Profesor;
import com.krakedev.persistencia.entidades.Venta;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {

	public static void main(String[] args) {
		EstadoCivil estadoCivil = new EstadoCivil("U","Union Libre");
		Persona persona = new Persona("1026850887","Julio","Jamas",estadoCivil);
		Profesor profesor = new Profesor(1, "Henry Fong");
		try {
			Date fechaNacimiento = Convertidor.convertirFecha("1999/08/15");
			Date horaNacimiento = Convertidor.convertirHora("10:23");
			Date fechaVenta= Convertidor.convertirFecha("2024/03/27");
			
			persona.setFechaNacimiento(fechaNacimiento);
			persona.setHoraNacimiento(horaNacimiento);
			persona.setCantidadAhorrada(new BigDecimal(1230.45));
			persona.setNumeroHijos(50);
			
			Estudiante estudiante = new Estudiante("1726850884", "Marco", "Chango", "hacker@hacker.com",fechaNacimiento, profesor);
			Producto producto = new Producto(1, "Martillo", "Herramienta para golpear", new BigDecimal(10.99), 50);
			Venta venta = new Venta(11, producto, fechaVenta, 4);
			AdminPersonas.actualizar(persona);
			AdminEstudiantes.actualizar(estudiante);
			AdminProductos.actualizar(venta);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error en el sistema: "+e.getMessage());
		}
	}

}