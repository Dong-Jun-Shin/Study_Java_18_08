package org.java.memberdto;

import java.util.ArrayList;

public class ArrayListMember {

	public static void main(String[] args) {

		ArrayList<MemberDto> members = new ArrayList<>();

		for (MemberDto dto : members) {
			String userId = dto.getUserId();
			String userPw = dto.getUserPw();
			String userName = dto.getUserName();
			int userAge = dto.getUserAge();
			String userGender = dto.getUserGender();
			String userPhone = dto.getUserPhone();
			String userHobbys = dto.getUserHobbys();

			System.out.print("아이디: " + userId + ", ");
			System.out.print("비밀번호: " + userPw + ", ");
			System.out.print("이름: " + userName + ", ");
			System.out.println("나이: " + userAge + " ");
		}
	}
}
