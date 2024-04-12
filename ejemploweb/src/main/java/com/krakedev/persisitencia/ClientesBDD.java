package com.krakedev.persisitencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.krakedev.entidades.Cliente;
import com.krakedev.excepciones.KrakeDevException;
import com.krakedev.utils.ConexionBDD;

public class ClientesBDD {

	public void insertar(Cliente cliente) throws KrakeDevException {
		Connection con = null;
		try {
			con = ConexionBDD.obtenerConexion();
			PreparedStatement ps = con
					.prepareStatement("INSERT INTO clientes(" + "cedula, nombre, numeroHijos) VALUES (" + "?,?,?)");

			ps.setString(1, cliente.getCedula());
			ps.setString(2, cliente.getNombre());
			ps.setInt(3, cliente.getNumeroHijos());

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al insertar el cliente. Detalle: "+e.getMessage());
		} catch (KrakeDevException e) {
			throw e;
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		}
	}

	public void actualizar(Cliente cliente) throws KrakeDevException {
		Connection con = null;
		try {
			con = ConexionBDD.obtenerConexion();
			PreparedStatement ps = con
					.prepareStatement("UPDATE clientes SET " + "nombre=?, numeroHijos =? WHERE " + "cedula = ?");

			ps.setString(1, cliente.getNombre());
			ps.setInt(2, cliente.getNumeroHijos());
			ps.setString(3, cliente.getCedula());

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al actualizar el cliente. Detalle: "+e.getMessage());
		} catch (KrakeDevException e) {
			throw e;
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		}
	}

	public ArrayList<Cliente> recuperarTodos() throws Exception {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Cliente cliente = null;
		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("SELECT cedula, nombre, numeroHijos from clientes");
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				int numeroHijos = rs.getInt("numeroHijos");
				cliente = new Cliente(cedula, nombre, numeroHijos);
				clientes.add(cliente);
			}
			
		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw new Exception("Error al consultar. Detalle: "+e.getMessage());
		}finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		}

		return clientes;

	}
	
	public Cliente busquedaPorPK(String cedulaBusqueda) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Cliente cliente = null;
		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("SELECT cedula, nombre, numeroHijos from clientes WHERE cedula=?");
			
			ps.setString(1, cedulaBusqueda);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.println("Existe el cliente");
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				int numeroHijos = rs.getInt("numeroHijos");
				cliente = new Cliente(cedula, nombre, numeroHijos);
				
			}else {
				System.out.println("No existe el cliente");
				
			}
			
		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw new Exception("Error al consultar. Detalle: "+e.getMessage());
		}finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		}

		return cliente;

	}
	
	public ArrayList<Cliente> buscarPorCantidadHijos(int cantidad) throws Exception {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Cliente cliente = null;
		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("SELECT cedula, nombre, numeroHijos from clientes WHERE numeroHijos >= ?");
			
			ps.setInt(1, cantidad);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				int numeroHijos = rs.getInt("numeroHijos");
				cliente = new Cliente(cedula, nombre, numeroHijos);
				clientes.add(cliente);
				
			}
			
		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw new Exception("Error al consultar. Detalle: "+e.getMessage());
		}finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		}

		return clientes;

	}
}
