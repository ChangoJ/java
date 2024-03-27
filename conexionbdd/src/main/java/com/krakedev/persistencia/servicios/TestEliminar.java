package com.krakedev.persistencia.servicios;

public class TestEliminar {
	public static void main(String[] args) {
		try {
			
			AdminPersonas.eliminar("1026850887");
			AdminEstudiantes.eliminar("1726850884");
			AdminProductos.eliminar(11);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error en el sistema: "+e.getMessage());
		}
	}
	
}
