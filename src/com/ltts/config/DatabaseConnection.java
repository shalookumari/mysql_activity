package com.ltts.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private static Connection con = null;

	static {
		String url = "jdbc:mysql://localhost:3306/shaloo";
		String user = "root";
		String pass = "admin";
		try {
			con = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return con;
	}
}
