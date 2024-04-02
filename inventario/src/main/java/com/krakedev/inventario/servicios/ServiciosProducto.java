package com.krakedev.inventario.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.inventario.entidades.Categoria;
import com.krakedev.inventario.entidades.Producto;

@Path("productos")
public class ServiciosProducto {
	
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Producto producto) {
		System.out.println(producto);
	}
	
	@Path("actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualzar(Producto producto) {
		System.out.println(producto);
	}

	@Path("consultar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Producto> recuperarTodos() {
		ArrayList<Producto> productos = new ArrayList<Producto>();
		Categoria categoria = new Categoria(1, "Herramienta");
		Categoria categoria2 = new Categoria(1, "Alimento");
		Producto producto = new Producto("1", "Martillo", categoria, 2.98, 20);
		productos.add(producto);
		Producto producto2 = new Producto("2", "Tango", categoria2, 3.40, 50);
		productos.add(producto2);
		Producto producto3 = new Producto("3", "Vita leche", categoria2, 5.50, 100);
		productos.add(producto3);
		
		return productos;
	}
}
