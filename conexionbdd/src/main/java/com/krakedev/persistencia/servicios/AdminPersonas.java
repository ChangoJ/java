package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);
	
	public static void  insertar(Persona persona) throws Exception{
		Connection connection = null;
		PreparedStatement ps = null;
		LOGGER.trace("Persona a insertar: "+persona);
		try {
			connection = ConexionBDD.conectar();

			ps = connection.prepareStatement(
					"INSERT INTO personas (cedula, nombre, apellido,estado_civil_codigo, estatura, fecha_nacimiento, hora_nacimiento, cantidad_ahorrada, numero_hijos )"
							+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?,?)");

			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setString(4, persona.getEstadoCivil().getCodigo());
			ps.setDouble(5, persona.getEstatura());
			ps.setDate(6, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(7, new Time(persona.getHoraNacimiento().getTime()));
			ps.setBigDecimal(8, persona.getCantidadAhorrada());
			ps.setInt(9, persona.getNumeroHijos());
			
			
			
			ps.executeUpdate();
			
		} catch (Exception e) {

			LOGGER.error("Error al insertar",e);
			throw new Exception("Error al insertar");
		}finally {
			try {
				connection.close();
			} catch (SQLException e2) {
				LOGGER.error("Error con la base de datos",e2);
				throw new Exception("Error con la base de datos");
			}
		}
	}
	
	public static void actualizar(Persona persona) throws Exception{
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = ConexionBDD.conectar();

			ps = connection.prepareStatement(
					"UPDATE personas SET nombre=?, apellido=?, estado_civil_codigo=?, estatura=?, fecha_nacimiento=?, hora_nacimiento=?, cantidad_ahorrada=?, numero_hijos=? WHERE cedula=?");

			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setString(3, persona.getEstadoCivil().getCodigo());
			ps.setDouble(4, persona.getEstatura());
			ps.setDate(5, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(6, new Time(persona.getHoraNacimiento().getTime()));
			ps.setBigDecimal(7, persona.getCantidadAhorrada());
			ps.setInt(8, persona.getNumeroHijos());
			ps.setString(9, persona.getCedula());
			
			
			
			ps.executeUpdate();
			
		} catch (Exception e) {

			LOGGER.error("Error al actualizar",e);
			throw new Exception("Error al actualizar");
		}finally {
			try {
				connection.close();
			} catch (SQLException e2) {
				LOGGER.error("Error con la base de datos",e2);
				throw new Exception("Error con la base de datos");
			}
		}
	}
	
	public static void eliminar(String cedula) throws Exception{
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = ConexionBDD.conectar();

			ps = connection.prepareStatement(
					"DELETE FROM personas WHERE cedula=?");

			ps.setString(1, cedula);
			
			
			
			ps.executeUpdate();
			
		} catch (Exception e) {

			LOGGER.error("Error al eliminar",e);
			throw new Exception("Error al eliminar");
		}finally {
			try {
				connection.close();
			} catch (SQLException e2) {
				LOGGER.error("Error con la base de datos",e2);
				throw new Exception("Error con la base de datos");
			}
		}
	}
	
	public static ArrayList<Persona> buscarPorNombre(String nombreBusqueda) throws Exception{
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			connection = ConexionBDD.conectar();
			ps = connection.prepareStatement("SELECT * FROM personas WHERE nombre like ? ");
			ps.setString(1, "%"+nombreBusqueda+"%");
			
			rs = ps.executeQuery();
			
			/*if(rs.next()) {
				//crear persona etc
			}
			*/
			while(rs.next()) {
				String nombre = rs.getString("nombre");
				String cedula = rs.getString("cedula");
				Persona persona = new Persona();
				persona.setNombre(nombre);
				persona.setCedula(cedula);
				personas.add(persona);
			}
			
		} catch (Exception e) {
			LOGGER.error("Error en la consulta",e);
			throw new Exception("Error en la consulta");
		}finally {
			try {
				connection.close();
			} catch (SQLException e2) {
				LOGGER.error("Error con la base de datos",e2);
				throw new Exception("Error con la base de datos");
			}
		}
		
		return personas;
		
	}
	
	public static Persona buscarPorCedula(String cedula) throws Exception{
		Persona persona = null;
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			connection = ConexionBDD.conectar();
			ps = connection.prepareStatement("SELECT * FROM personas WHERE cedula = ? ");
			ps.setString(1, cedula);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				persona = new Persona();
				persona.setCedula(rs.getString("cedula"));
                persona.setNombre(rs.getString("nombre"));
                persona.setApellido(rs.getString("apellido"));
                
			}
			
			
			
		} catch (Exception e) {
			LOGGER.error("Error en la consulta",e);
			throw new Exception("Error en la consulta");
		}finally {
			try {
				connection.close();
			} catch (SQLException e2) {
				LOGGER.error("Error con la base de datos",e2);
				throw new Exception("Error con la base de datos");
			}
		}
		
		return persona;
		
	}
	
	public static  ArrayList<Persona> buscarPorEstatura(double estatura) throws Exception{
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			connection = ConexionBDD.conectar();
			ps = connection.prepareStatement("SELECT * FROM personas WHERE estatura > ? ");
			ps.setDouble(1, estatura);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String nombre = rs.getString("nombre");
				String cedula = rs.getString("cedula");
				double estaturaP = rs.getDouble("estatura");
				Persona persona = new Persona();
				persona.setNombre(nombre);
				persona.setCedula(cedula);
				persona.setEstatura(estaturaP);
				personas.add(persona);
			}
			
			
			
		} catch (Exception e) {
			LOGGER.error("Error en la consulta",e);
			throw new Exception("Error en la consulta");
		}finally {
			try {
				connection.close();
			} catch (SQLException e2) {
				LOGGER.error("Error con la base de datos",e2);
				throw new Exception("Error con la base de datos");
			}
		}
		
		return personas;
		
	}
}
