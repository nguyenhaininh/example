package com.javatpoint;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {

	public static boolean validate(String username, String userpass) {
		boolean status = false;
		Statement stmt = null;
		Connection conn = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			// conn =
			// DriverManager.getConnection("jdbc:mysql://localhost:3306/testdatabase?user=testuser&password=testpassword");
			String connectionUrl = "jdbc:mysql://localhost:3306/java_framework";
			String connectionUser = "root";
			String connectionPassword = "";
			conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM `user3333` WHERE ");
			status=rs.next();
			while(rs.next()){
				String name = rs.getString("NAME");
				String password = rs.getString("PASSWORD");
				System.out.println(name+" "+password );
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}