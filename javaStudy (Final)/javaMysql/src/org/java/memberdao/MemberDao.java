package org.java.memberdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.java.dbconnect.DBConnect;
import org.java.memberdto.MemberDto;

public class MemberDao {
	//������ ���� ��ü [Data Access Object]
	//DB ����
	
	
	//insertDo
	
	public int insertDo(String userId, String userPw, String userName, int userAge, String userGender, String userPhone, String userHobbys) {
	
		int result=0;
		
		Connection conn=null; //Ŀ�ؼ� ��ü
		PreparedStatement pstm=null; //SQL
		String query=""; //query��

		//2.DB����
		
		try {
			conn=DBConnect.getConnection();
			query="insert into joinmember(userId,userPw,userName,userAge,userGender,userPhone,userHobbys) values(?,?,?,?,?,?,?)";
			pstm=conn.prepareStatement(query); //�������� ����
			
			pstm.setString(1,  userId);
			pstm.setString(2,  userPw);;
			pstm.setString(3,  userName);
			pstm.setInt(4,  userAge);
			pstm.setString(5,  userGender);
			pstm.setString(6,  userPhone);;
			pstm.setString(7,  userHobbys);
			
			result = pstm.executeUpdate(); //������ó�� ����1
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) conn.close(); //conn �ݱ�
				if(pstm!=null) pstm.close(); //pstm �ݱ�
			}catch (Exception e) {
				e.printStackTrace();
			}finally {}
			
		}
		
		return result;
	}
	
	public int updateDo(String userId, String userPw, String userName, int userAge, String userGender, String userPhone, String userHobbys) {
		
		int result=0;
		
		Connection conn=null; //Ŀ�ؼ� ��ü
		PreparedStatement pstm=null; //SQL
		String query=""; //query��

		//2.DB����
		
		try {
			conn=DBConnect.getConnection();
			query="update joinmember set userPw=?, userName=?, userAge=?, userGender=?, userPhone=?, userHobbys=? where userId=?";
			pstm=conn.prepareStatement(query); //�������� ����
			
		
			pstm.setString(1, userPw);
			pstm.setString(2, userName);
			pstm.setInt(3, userAge);
			pstm.setString(4,  userGender);
			pstm.setString(5,  userPhone);
			pstm.setString(6,  userHobbys);
			pstm.setString(7, userId);
			
			result = pstm.executeUpdate(); //������ó�� ����1
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) conn.close(); //conn �ݱ�
				if(pstm!=null) pstm.close(); //pstm �ݱ�
			}catch (Exception e) {
				e.printStackTrace();
			}finally {}
			
		}
		
		return result;
	}
	
	public int deleteDo(String userId) {
		
		int result = 0;
		
		Connection conn =null;
		PreparedStatement pstm = null;
		String query ="";
		
		try {
			conn=DBConnect.getConnection();
			query="delete from joinmember where userId=?";
			pstm=conn.prepareStatement(query);
			
			pstm.setString(1, userId);
			
			result = pstm.executeUpdate();
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) conn.close();
				if(pstm!=null) conn.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {}
		}
		
		return result;
	}
	
	public ArrayList<MemberDto> selectDo() {
		
		ArrayList<MemberDto> members=new ArrayList<>();
		
		Connection conn =null;
		PreparedStatement pstm = null;
		ResultSet rs=null;
				
		String query = "";
		
		try {
			conn=DBConnect.getConnection();
			query="select userId, userPw, userName, userAge, userGender, userPhone, userHobbys from joinmember";
			pstm=conn.prepareStatement(query);
			
			rs=pstm.executeQuery();
			
			while(rs.next()) {
				String userId=rs.getString(1);
				String userPw=rs.getString(2);
				String userName=rs.getString(3);
				int userAge=rs.getInt(4);
				String userGender=rs.getString(5);
				String userPhone=rs.getString(6);
				String userHobbys=rs.getString(7);
				
				//members.add(new MemberDto(userId, userPw, userName, userAge));
				//members.addAll(dto);
				
				members.add(new MemberDto(userId, userPw, userName, userAge, userGender, userPhone, userHobbys));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(conn!= null) conn.close();
				if(pstm!= null) pstm.close();
				if(rs!=null) rs.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		return members;
	}
}