package myjdbc;

import java.sql.*;

public class DBConnection {

	public static void main(String[] args) {
		String url = "jdbc:mysql://root@localhost:3306/classicmodels";
		String user = "root";
		String password = "root";

		try {
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println("Connected successfully");
			con.close();

		} catch (SQLException e) {
			System.out.println("Connection Failed");
			e.printStackTrace();
		}
	}
}