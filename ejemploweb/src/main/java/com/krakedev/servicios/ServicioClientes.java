package com.krakedev.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.entidades.Cliente;

@Path("customers")
public class ServicioClientes {
	
	@Path("m1")
	@GET
	public String saludar() {
		return "Hola mundo Rest Web Services- RETO 36-NEW";
	}
	
	@Path("m2")
	@GET
	public String saludar2() {
		return "Hola mundo Rest Web Services- RETO 36-2newww";
	}
	
	@Path("mbuscar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Cliente buscar() {
		Cliente cliente = new Cliente("1726850884", "Jordan");
		
		return cliente;
	}
	
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Cliente cliente) {
		
		System.out.println(cliente);
		
	}
	
	@Path("act")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Cliente cliente) {
		
		System.out.println("Actualizar: "+cliente);
		
	}
	
}
