package com.krakedev.composicion.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdminPorducto {

	public static void main(String[] args) {
		Producto productoMasCaro;
		
		AdminProducto  adminProducto = new AdminProducto();
		Producto producto = new Producto("Doritos", 0.8);
		Producto producto2 = new Producto("Oreo", 0.8);
	
		productoMasCaro = adminProducto.bucarMasCaro(producto, producto2);
		
		if(productoMasCaro == null) {
			System.out.println("Son iguales");
		}else {
			System.out.println("El mas caro es: "+productoMasCaro.getNombre());
			
		}
			
		
		
	}

}
