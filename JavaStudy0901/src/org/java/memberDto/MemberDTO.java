package org.java.memberDto;

public class MemberDTO {
	// 실무에서 사용하는 방식의 코딩 (약속)
	private String userId;
	private String userPW;
	private int userAge;
	private String userName;

	// setters (초기화)
	public void setUserId(String userId) {
		this.userId = userId;
	}

	// getters (가져오기, 출력)
	public String getUserId() {
		return userId;
	}

	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}

	public String getUserPW() {
		return userPW;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

}
