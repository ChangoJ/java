package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBDD {
	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = "jdbc:postgresql://localhost:5434/postgres";
	private static final String USER = "postgres";
	private static final String PASSWORD = "admin";
	
	public static Connection conectar() throws Exception{
		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new Exception("Error en la infrastructura");
		}finally {
			//cerrar conexion
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Error de infraestructura");
			}
		}
		
		return connection;
	}
}
