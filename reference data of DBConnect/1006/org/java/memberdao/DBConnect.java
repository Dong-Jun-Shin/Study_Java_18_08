package org.java.memberdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static void main(String[] args) {
			
		//1. ����̹� �ε�(Mysql >><< Java)
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("����̹� OK");
			} catch (ClassNotFoundException e) {
				System.out.println("����̹� NO");
				e.printStackTrace();
			}
	
		//2. DB����
		String url="jdbc:mysql://localhost:3306/member?useSSL=false&serverTimezone=UTC";
		String hostId="root";
		String hostPw="1111";
		
		Connection conn=null; // ����(Ŀ�ؼǰ�ü)
		

		try {
			conn=DriverManager.getConnection(url, hostId, hostPw);
			System.out.println("DB���� OK");
			
			
		} catch (SQLException e) {
			System.out.println("DB���� NO");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
		
	}
}
