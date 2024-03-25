package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestConexion3 {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5434/postgres","postgres","admin");
			System.out.println("Conexion exitosa");
	
			ps = connection.prepareStatement("INSERT INTO productos (codigo, nombre, descripcion, precio, stock)"
					+ " VALUES (?, ?, ?, ?, ?)");
			
			ps.setInt(1, 11);
			ps.setString(2, "Computador Gaming");
			ps.setString(3, "Super pc");
			ps.setBigDecimal(4, new BigDecimal(100000));
			ps.setInt(5, 1);
			
			ps.executeUpdate();
			System.out.println("Insert exitoso de producto");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
