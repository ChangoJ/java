package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		ArrayList<Producto> productos = new ArrayList<Producto>();
		
		MaquinaDulces maquina=new MaquinaDulces();
		
		maquina.configurarMaquina("A1", "A2", "B1", "B2","C1", "C2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "A1", 4);
		
		Producto producto2=new Producto("D451","Doritos",0.35);
		maquina.cargarProducto(producto2, "A2", 6);

		Producto producto3=new Producto("D452","gALAK",0.60);
		maquina.cargarProducto(producto3, "B1", 6);

		Producto producto4=new Producto("D453","Ritz",0.50);
		maquina.cargarProducto(producto4, "B2", 6);

		Producto producto5=new Producto("D454","Oreo",0.85);
		maquina.cargarProducto(producto5, "C1", 6);

		Producto producto6=new Producto("D457","Delic",0.90);
		maquina.cargarProducto(producto6, "C2", 6);
		
		productos = maquina.buscarMenores(0.80);
		
		maquina.imprimirMenores(productos);

	}

}
