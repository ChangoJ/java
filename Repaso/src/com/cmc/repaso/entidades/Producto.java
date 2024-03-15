package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public void setPrecio(double precio) {
		
		if (precio < 0) {
			this.precio = precio * -1;
		}
	}

	public double calcularPrecioPromo(double porcentajeDescuento) {
		double precioFinal;
		double descuento;
	
		descuento = this.precio * (porcentajeDescuento / 100);
		precioFinal = this.precio - descuento;

		return precioFinal;
	}

}
