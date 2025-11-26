package myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class DBCreation {

	public static void main(String[] args) {
		String url = "jdbc:mysql://root@localhost:3306/classicmodels";
		String user = "root";
		String password = "root";
		
		String createTable = "Create table if not exists students("+"id int primary key auto_increment,"
		+"name varchar(100) not null,"
		+"position varchar(100),"
		+"salary decimal(10,2)"+");";
		
		try (Connection con = DriverManager.getConnection(url,user,password);
			
			Statement stat = con.createStatement()){
			
			stat.executeUpdate(createTable);
			System.out.println("Table Created Successfully");
			
			con.close();
			stat.close();

		} catch (SQLException e) {
			System.out.println("Table Not Created! ");
			e.printStackTrace();
		}


	}

}
