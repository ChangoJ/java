package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {

		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();

		productoA.setNombre("Paracetamol");
		productoA.setDescripcion("Medicamento");
		productoA.setPrecio(5.99);
		productoA.setStockActual(10);

		productoB.setNombre("Pasta dental");
		productoB.setDescripcion("Higiene bucal");
		productoB.setPrecio(2.49);
		productoB.setStockActual(20);

		productoC.setNombre("Vitamina C");
		productoC.setDescripcion("Suplemento");
		productoC.setPrecio(8.99);
		productoC.setStockActual(15);

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
