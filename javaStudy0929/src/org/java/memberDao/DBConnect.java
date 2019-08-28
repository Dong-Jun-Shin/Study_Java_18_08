package org.java.memberDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static void main(String[] args) {
		
		
		//1.드라이버 로드 (MYSQL >><< Java)
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로드 OK");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로드 NO");
			e.printStackTrace();
			
		}
		
		//2. DB연결
		String url="jdbc:mysql://localhost:3306/member?useSSL=false&serverTimezone=UTC";
		String hostId="root";
		String hostPw="1111";
		
		Connection conn=null; //연결(커넥션객체)
		
		try {
			conn=DriverManager.getConnection(url, hostId, hostPw);
			System.out.println("DB연결 OK");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DB연결 NO");
			e.printStackTrace();
			
		}
	}
}


