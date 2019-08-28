package org.java.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection getConnection() {
		Connection conn = null; // ¿¬°á (Ä¿³Ø¼Ç °´Ã¼)

		String url = "jdbc:mysql://localhost:3306/member?useSSL=false&serverTimezone=UTC";
		String hostId = "root";
		String hostPw = "1111";
		String driver = "com.mysql.cj.jdbc.Driver";

		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, hostId, hostPw);
			
			System.out.println("DB¿¬°á OK");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
		
		return conn;
	}
}