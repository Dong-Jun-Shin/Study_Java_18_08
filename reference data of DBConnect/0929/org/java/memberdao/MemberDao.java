package org.java.memberdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.java.memberdto.MemberDto;

public class MemberDao {
	// DB°ü·Ã
	private String url = "jdbc:mysql://localhost:3306/member?useSSL=false&serverTimezone=UTC";
	private String hostId = "root";
	private String hostPw = "1111";

	public MemberDao() {
		// 1. µå¶óÀÌ¹ö
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("µå¶óÀÌ¹ö OK");
		} catch (ClassNotFoundException e) {
			System.out.println("µå¶óÀÌ¹ö NO");
			e.printStackTrace();
		}
	}

	// insertDo
	public int insertDo(String userId, String userPw, String userName, int userAge) {
		int result = 0;

		Connection conn = null;// Ä¿³Ø¼Ç °´Ã¼
		PreparedStatement pstm = null;// SQL
		String query = "";// Äõ¸®¹®;

		try {
			// 2. DB¿¬°á
			conn = DriverManager.getConnection(url, hostId, hostPw);
			query = "insert into memberJoin(userId,userPw,userName,userAge) values(?,?,?,?)";
			pstm = conn.prepareStatement(query);// Äõ¸®¹®À» ½ÇÇà

			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, userName);
			pstm.setInt(4, userAge);

			result = pstm.executeUpdate();// Äõ¸®¹® Ã³¸® ¼º°ø 1

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close(); // conn ´Ý±â
				if (pstm != null)
					pstm.close(); // pstm ´Ý±â
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}
		}
		return result;
	}

	// updateDo
	public int updateDo(String userId, String userPw, String userName, int userAge) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DriverManager.getConnection(url, hostId, hostPw);
			query = "update memberJoin set userPw=?, userName=?,userAge=? where userId=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userPw);
			pstm.setString(2, userName);
			pstm.setInt(3, userAge);
			pstm.setString(4, userId);

			result = pstm.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close(); // conn ´Ý±â
				if (pstm != null)
					pstm.close(); // pstm ´Ý±â
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}
		}

		return result;
	}

	// deleteDo
	public int deleteDo(String userId) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DriverManager.getConnection(url, hostId, hostPw);
			query = "delete from memberJoin  where userId=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);

			result = pstm.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close(); // conn ´Ý±â
				if (pstm != null)
					pstm.close(); // pstm ´Ý±â
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}
		}
		return result;
	}

	// selectDo

	public ArrayList<MemberDto> selectDo() {

		ArrayList<MemberDto> members = new ArrayList<>();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DriverManager.getConnection(url, hostId, hostPw);
			query = "select userId,userPw,userName, userAge from memberJoin";
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery();// DBµ¥ÀÌÅÍ¸¦ °¡Á® ¿À´Â...

			while (rs.next()) {
				String userId = rs.getString(1);
				String userPw = rs.getString(2);
				String userName = rs.getString(3);
				int userAge = rs.getInt(4);
//				MemberDto dto=new MemberDto(userId, userPw, userName, userAge);
//				members.add(dto);
				members.add(new MemberDto(userId, userPw, userName, userAge));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close(); // conn ´Ý±â
				if (pstm != null)
					pstm.close(); // pstm ´Ý±â
				if (rs != null)
					rs.close(); // rs ´Ý±â
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}
		}

		return members;
	}

}
