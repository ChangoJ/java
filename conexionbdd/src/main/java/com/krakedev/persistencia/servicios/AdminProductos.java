package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Estudiante;
import com.krakedev.persistencia.entidades.Producto;
import com.krakedev.persistencia.entidades.Venta;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminProductos {
	private static final Logger LOGGER = LogManager.getLogger(AdminProductos.class);

	public static void insertar(Venta venta) throws Exception {
		Connection connection = null;
		PreparedStatement ps = null;
		LOGGER.trace("Producto a insertar: " + venta);
		try {
			connection = ConexionBDD.conectar();

			ps = connection.prepareStatement(
					"INSERT INTO ventas (id_venta, codigo_producto, fecha_venta, cantidad)"
							+ "VALUES (?, ?, ?, ?)");

			ps.setInt(1, venta.getId_venta());
			ps.setInt(2, venta.getCodigo_producto().getCodigo());
			ps.setDate(3, new java.sql.Date(venta.getFecha_venta().getTime()));
			ps.setInt(4, venta.getCantidad());

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

	public static void actualizar(Venta venta) throws Exception {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = ConexionBDD.conectar();

			ps = connection.prepareStatement(
					"UPDATE ventas SET codigo_producto=?, fecha_venta=?, cantidad=? WHERE id_venta=?");


			
			ps.setInt(1, venta.getCodigo_producto().getCodigo());
			ps.setDate(2, new java.sql.Date(venta.getFecha_venta().getTime()));
			ps.setInt(3, venta.getCantidad());
			ps.setInt(4, venta.getId_venta());

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

	public static void eliminar(int id_venta) throws Exception {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = ConexionBDD.conectar();

			ps = connection.prepareStatement("DELETE FROM ventas WHERE id_venta=?");

			ps.setInt(1, id_venta);

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
