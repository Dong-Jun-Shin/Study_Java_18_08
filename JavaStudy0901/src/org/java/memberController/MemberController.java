package org.java.memberController;

import org.java.memberDto.MemberDTO;

public class MemberController {

	public static void main(String[] args) {
		
		MemberDTO member1 = new MemberDTO();
		member1.setUserId("id1");
		member1.setUserPW("1111");
		member1.setUserAge(11);
		member1.setUserName("abc");
		
		String userId=member1.getUserId();
		String userPw=member1.getUserPW();
		int userAge=member1.getUserAge();
		String userName=member1.getUserName();
		
		
		System.out.println("���̵�: "+userId);
		System.out.println("��й�ȣ: "+userPw);
		System.out.println("����: "+userAge);
		System.out.println("�̸�: "+userName);
	}
}
