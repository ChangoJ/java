package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Estudiante;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminEstudiantes {
	private static final Logger LOGGER = LogManager.getLogger(AdminEstudiantes.class);

	public static void insertar(Estudiante estudiante) throws Exception {
		Connection connection = null;
		PreparedStatement ps = null;
		LOGGER.trace("Estudiante a insertar: " + estudiante);
		try {
			connection = ConexionBDD.conectar();

			ps = connection.prepareStatement(
					"INSERT INTO estudiantes (cedula, nombre, apellido,email, fecha_nacimiento, codigo_profesor )"
							+ "VALUES (?, ?, ?, ?, ?, ?)");

			ps.setString(1, estudiante.getCedula());
			ps.setString(2, estudiante.getNombre());
			ps.setString(3, estudiante.getApellido());
			ps.setString(4, estudiante.getEmail());
			ps.setDate(5, new java.sql.Date(estudiante.getFechaNacimiento().getTime()));
			ps.setInt(6, estudiante.getCodigoProfesor().getCodigo());

			ps.executeUpdate();

		} catch (Exception e) {

			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			try {
				connection.close();
			} catch (SQLException e2) {
				LOGGER.error("Error con la base de datos", e2);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void actualizar(Estudiante estudiante) throws Exception {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = ConexionBDD.conectar();

			ps = connection.prepareStatement(
					"UPDATE estudiantes SET nombre=?, apellido=?, email=?, fecha_nacimiento=?, codigo_profesor=? WHERE cedula=?");

			ps.setString(1, estudiante.getNombre());
			ps.setString(2, estudiante.getApellido());
			ps.setString(3, estudiante.getEmail());
			ps.setDate(4, new java.sql.Date(estudiante.getFechaNacimiento().getTime()));
			ps.setInt(5, estudiante.getCodigoProfesor().getCodigo());
			ps.setString(6, estudiante.getCedula());

			ps.executeUpdate();

		} catch (Exception e) {

			LOGGER.error("Error al actualizar", e);
			throw new Exception("Error al actualizar");
		} finally {
			try {
				connection.close();
			} catch (SQLException e2) {
				LOGGER.error("Error con la base de datos", e2);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void eliminar(String cedula) throws Exception {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = ConexionBDD.conectar();

			ps = connection.prepareStatement("DELETE FROM estudiantes WHERE cedula=?");

			ps.setString(1, cedula);

			ps.executeUpdate();

		} catch (Exception e) {

			LOGGER.error("Error al eliminar", e);
			throw new Exception("Error al eliminar");
		} finally {
			try {
				connection.close();
			} catch (SQLException e2) {
				LOGGER.error("Error con la base de datos", e2);
				throw new Exception("Error con la base de datos");
			}
		}
	}
}
