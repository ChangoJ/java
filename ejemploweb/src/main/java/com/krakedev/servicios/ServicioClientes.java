package com.krakedev.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.krakedev.entidades.Cliente;
import com.krakedev.excepciones.KrakeDevException;
import com.krakedev.persisitencia.ClientesBDD;

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
		Cliente cliente = new Cliente("1726850884", "Jordan", 4);

		return cliente;
	}

	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertar(Cliente cliente) {

		System.out.println(cliente);
		ClientesBDD client = new ClientesBDD();
		try {
			client.insertar(cliente);
			return Response.ok().build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}

	}

	@Path("act")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response actualizar(Cliente cliente) {

		System.out.println("Actualizar: " + cliente);
		ClientesBDD client = new ClientesBDD();
		try {
			client.actualizar(cliente);
			return Response.ok().build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}

	}

	@Path("all")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response obtenerClientes() {
		ClientesBDD client = new ClientesBDD();
		ArrayList<Cliente> clientes = null;
		try {
			clientes = client.recuperarTodos();
			return Response.ok(clientes).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Response.serverError().build();
		}

	}

	@Path("buscarPorCedula/{cedulaParam}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarPorCedula(@PathParam("cedulaParam")  String cedula) {
		ClientesBDD client = new ClientesBDD();
		Cliente cliente = null;
		try {
			cliente = client.busquedaPorPK(cedula);
			return Response.ok(cliente).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Response.serverError().build();
		}

	}
	
	
	@Path("buscarPorCantidadHijos/{cantidad}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarPorCantidadHijos(@PathParam("cantidad")  int hijos) {
		ClientesBDD client = new ClientesBDD();
		ArrayList<Cliente> clientes = null;
		try {
			clientes = client.buscarPorCantidadHijos(hijos);
			return Response.ok(clientes).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Response.serverError().build();
		}

	}
}
