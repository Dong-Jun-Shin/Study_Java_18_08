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

			System.out.print("���̵�: " + userId + ", ");
			System.out.print("��й�ȣ: " + userPw + ", ");
			System.out.print("�̸�: " + userName + ", ");
			System.out.println("����: " + userAge + " ");
		}
	}
}
