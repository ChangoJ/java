package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestConexion {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5434/postgres","postgres","admin");
			System.out.println("Conexion exitosa");
	
			ps = connection.prepareStatement("INSERT INTO personas (cedula, nombre, apellido, estatura, fecha_nacimiento, hora_nacimiento, cantidad_ahorrada, numero_hijos)"
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
			
			ps.setString(1, "1224987235");
			ps.setString(2, "Jordan");
			ps.setString(3, "Chango");
			ps.setDouble(4, 1.75);
			ps.setDate(5, java.sql.Date.valueOf("1990-05-15"));
			ps.setTime(6, java.sql.Time.valueOf("08:30:00"));
			ps.setBigDecimal(7, new BigDecimal(5000));
			ps.setInt(8, 2);
			
			ps.executeUpdate();
			System.out.println("Insert exitoso");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
