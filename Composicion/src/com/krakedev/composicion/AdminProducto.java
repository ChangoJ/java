package com.krakedev.composicion;

public class AdminProducto {
	public Producto bucarMasCaro(Producto producto1, Producto producto2) {
		if(producto1.getPrecio() > producto2.getPrecio()) {
			return producto1;
		}else if(producto2.getPrecio() > producto1.getPrecio()){
			return producto2;
		}else {
			return null;
		}
	}
}
