package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto {

	public static void main(String[] args) {

		Producto productoA = new Producto("Paracetamol", "Medicamento", 5.99, 10);
		Producto productoB = new Producto("Pasta dental", "Higiene bucal", 2.49, 20);
		Producto productoC = new Producto("Vitamina C", "Suplemento", 8.99, 15);
		
		System.out.println("Producto A:");
		System.out.println("Nombre: " + productoA.getNombre());
		System.out.println("Descripción: " + productoA.getDescripcion());
		System.out.println("Precio: " + productoA.getPrecio());
		System.out.println("Stock Actual: " + productoA.getStockActual());

		System.out.println("\nProducto B:");
		System.out.println("Nombre: " + productoB.getNombre());
		System.out.println("Descripción: " + productoB.getDescripcion());
		System.out.println("Precio: " + productoB.getPrecio());
		System.out.println("Stock Actual: " + productoB.getStockActual());

		System.out.println("\nProducto C:");
		System.out.println("Nombre: " + productoC.getNombre());
		System.out.println("Descripción: " + productoC.getDescripcion());
		System.out.println("Precio: " + productoC.getPrecio());
		System.out.println("Stock Actual: " + productoC.getStockActual());

	}

}
