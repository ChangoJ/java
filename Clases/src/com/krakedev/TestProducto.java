package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {

		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();

		productoA.nombre = "Paracetamol";
        productoA.descripcion = "Medicamento";
        productoA.precio = 5.99;
        productoA.stockActual = 10;

        productoB.nombre = "Pasta dental";
        productoB.descripcion = "Higiene bucal";
        productoB.precio = 2.49;
        productoB.stockActual = 20;

        productoC.nombre = "Vitamina C";
        productoC.descripcion = "Suplemento";
        productoC.precio = 8.99;
        productoC.stockActual = 15;

		System.out.println("Producto A:");
		System.out.println("Nombre: " + productoA.nombre);
		System.out.println("Descripción: " + productoA.descripcion);
		System.out.println("Precio: " + productoA.precio);
		System.out.println("Stock Actual: " + productoA.stockActual);

		System.out.println("\nProducto B:");
		System.out.println("Nombre: " + productoB.nombre);
		System.out.println("Descripción: " + productoB.descripcion);
		System.out.println("Precio: " + productoB.precio);
		System.out.println("Stock Actual: " + productoB.stockActual);

		System.out.println("\nProducto C:");
		System.out.println("Nombre: " + productoC.nombre);
		System.out.println("Descripción: " + productoC.descripcion);
		System.out.println("Precio: " + productoC.precio);
		System.out.println("Stock Actual: " + productoC.stockActual);

	}

}
