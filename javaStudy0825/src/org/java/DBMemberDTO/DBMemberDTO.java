package org.java.DBMemberDTO;

public class DBMemberDTO {
	
	private String userId; //�ż���
	private String userPw;
	private int userAge;
	
	//setter getter
								//��������
	public void setUserId(String userId) {
		//���(�ʵ�)
		this.userId=userId;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserPw(String userPw) {
		this.userPw=userPw;
	}
	
	public String getUserPw() {
		return userPw;
	}
	
	public void setUserAge(int userAge) {
		this.userAge=userAge;
	}
	
	public int getUserAge() {
		return userAge;
	}
}
