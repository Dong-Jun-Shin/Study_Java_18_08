package org.java.DBMemberDTO;

public class DBMemberDTO {
	
	private String userId; //매서드
	private String userPw;
	private int userAge;
	
	//setter getter
								//지역변수
	public void setUserId(String userId) {
		//멤버(필드)
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
