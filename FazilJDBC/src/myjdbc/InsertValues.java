package myjdbc;

import java.sql.*;

public class InsertValues {

	public static void main(String[] args) {
		String url = "jdbc:mysql://root@localhost:3306/classicmodels";
		String user = "root";
		String password = "root";
		
		String insertSQL = "insert into students (name,position,salary) values" + "(?,?,?)";
		
		try (Connection con = DriverManager.getConnection(url,user,password);
				
				PreparedStatement pstat = con.prepareStatement(insertSQL)){
				
			pstat.setString(1, "Fazil");
			pstat.setString(2,"Captian");
			pstat.setBigDecimal(3,new java.math.BigDecimal("500000"));
			
			pstat.setString(1, "Suraj");
			pstat.setString(2,"Vice-Captian");
			pstat.setBigDecimal(3,new java.math.BigDecimal("500000"));
			
			int rowsAdded = pstat.executeUpdate();
			
			System.out.println("Row added  "+rowsAdded);
			
			con.close();
			pstat.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
