package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {
	public static void main(String[] args) {
		Producto producto = new Producto("Aceite", 200);
		
		producto.setPrecio(1000);
		
		System.out.println(producto.calcularPrecioPromo(15));
	}
}
