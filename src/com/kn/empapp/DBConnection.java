package com.kn.empapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static Connection con;
	public static Connection createConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/employee_DB";
			String user_name="root";
			String password="admin";
			 con=DriverManager.getConnection(url, user_name, password);

		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
