package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestConexion2 {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5434/postgres","postgres","admin");
			System.out.println("Conexion exitosa");
	
			ps = connection.prepareStatement("INSERT INTO estudiantes (cedula, nombre, apellido, email, fecha_nacimiento, codigo_profesor)"
					+ "VALUES (?, ?, ?, ?, ?, ?)");
			
			ps.setString(1, "1224987235");
			ps.setString(2, "Jordan");
			ps.setString(3, "Chango");
			ps.setString(4, "chango@hacker.com");
			ps.setDate(5, java.sql.Date.valueOf("2000-08-15"));
			ps.setInt(6, 1);
			
			ps.executeUpdate();
			System.out.println("Insert exitoso de estudiante");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
