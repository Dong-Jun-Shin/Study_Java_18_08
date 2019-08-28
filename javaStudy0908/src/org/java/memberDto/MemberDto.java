package org.java.memberDto;

public class MemberDto {

	private String userId;
	private String userPw;
	private String userName;
	
	

	public MemberDto(String userId, String userPw) {
		super();
		this.userId = userId;
		this.userPw = userPw;
	}
	

	//set «ÿ¡‹
	public MemberDto(String userId, String userPw, String userName) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public String getUserName() {
		return userName;
	}
		
}
