package org.java.memberdto;

public class MemberDto {
	//데이터 전송 객체(Data transfer object)
	
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private String userGender;
	private String userPhone;
	private String userHobbys;
	
	public MemberDto(String userId, String userPw, String userName, int userAge, String userGender, String userPhone,
			String userHobbys) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
		this.userPhone = userPhone;
		this.userHobbys = userHobbys;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserHobbys() {
		return userHobbys;
	}
	public void setUserHobbys(String userHobbys) {
		this.userHobbys = userHobbys;
	}
}
