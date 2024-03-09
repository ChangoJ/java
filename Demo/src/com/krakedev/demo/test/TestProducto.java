package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto = new Producto(1,"Arroz");
		
		producto.setDescripcion("Arroz blanco");
		producto.setPeso(2.5);
		
		System.out.println("Codigo: "+producto.getCodigo());
		System.out.println("Nombre: "+producto.getNombre());
		System.out.println("Descripcion: "+producto.getDescripcion());
		System.out.println("Peso: "+producto.getPeso());
		

	}

}
