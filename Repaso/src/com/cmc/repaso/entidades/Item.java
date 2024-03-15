package com.cmc.repaso.entidades;

public class Item {
	
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	
	public Item(String nombre, int productosActuales) {
	
		this.nombre = nombre;
		this.productosActuales = productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public void imprimir() {
		System.out.println(
				"Nombre: " + nombre + "\n" + "Productos Actuales: " + productosActuales + "\n" + "Productos Devueltos: "
						+ productosDevueltos + "\n" + "Productos Vendidos: " + productosVendidos + "\n");
	}

	public void vender(int productosVendidos) {
		this.productosActuales -= productosVendidos;
		this.productosVendidos += productosVendidos;

	}

	public void devolver(int productosVendidos) {
		this.productosActuales += productosVendidos;
		this.productosVendidos -= productosVendidos;
		this.productosDevueltos += productosVendidos;
	}
}
