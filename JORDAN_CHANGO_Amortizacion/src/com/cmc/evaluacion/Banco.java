package com.cmc.evaluacion;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();;

	public Cliente buscarCliente(String cedula) {
		Cliente clienteEncontrado = null;
		for (Cliente cliente : clientes) {
			if (cliente.getCedula().equals(cedula)) {
				clienteEncontrado = cliente;
				break;
			}
		}
		return clienteEncontrado;

	}

	public void registrarCliente(Cliente cliente) {
		Cliente clienteVerificar = buscarCliente(cliente.getCedula());
		if (clienteVerificar == null) {
			clientes.add(cliente);
		} else {
			System.out.println("Ya existe: " + cliente.getCedula());
		}

	}
	
	public void asignarPrestamo(String cedula, Prestamo prestamo) {
		Cliente clienteVerificar = buscarCliente(cedula);
		
		if(clienteVerificar == null) {
			System.out.println("No es cliente del banco");
		}else {
			clienteVerificar.getPrestamos().add(prestamo);
		}
		
		
	}
	
	public ArrayList<Prestamo> buscarPrestamos(String cedula) {
		ArrayList<Prestamo> prestamos= null;
		Cliente clienteVerificar = buscarCliente(cedula);
		if(clienteVerificar != null) {
			if(clienteVerificar.getPrestamos().size()> 0 || clienteVerificar.getPrestamos()!=null) {
				prestamos = clienteVerificar.getPrestamos();
			}else {
				System.out.println("El cliente no tiene prestamos");
			}
		}
		return prestamos;
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

}
