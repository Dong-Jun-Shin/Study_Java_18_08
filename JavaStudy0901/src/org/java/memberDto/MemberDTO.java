package org.java.memberDto;

public class MemberDTO {
	// �ǹ����� ����ϴ� ����� �ڵ� (���)
	private String userId;
	private String userPW;
	private int userAge;
	private String userName;

	// setters (�ʱ�ȭ)
	public void setUserId(String userId) {
		this.userId = userId;
	}

	// getters (��������, ���)
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
