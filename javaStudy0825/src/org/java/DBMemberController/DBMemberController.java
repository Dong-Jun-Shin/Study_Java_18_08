package org.java.DBMemberController;

import java.util.Scanner;

import org.java.DBMemberDTO.DBMemberDTO;

public class DBMemberController {

	public static void main(String[] args) {
		
		System.out.println("�����Դϴ�. �Ʒ��� ���� �Է����ּ���.");
		
		DBMemberDTO member1 = new DBMemberDTO();
		

		member1.setUserId("manso1");
		String userId = member1.getUserId();//
		System.out.println("���̵�: " + userId);

		member1.setUserPw("1111");
		String userPw = member1.getUserPw();//
		System.out.println("���: " + userPw);

		member1.setUserAge(17);
		int userAge = member1.getUserAge();//
		System.out.println("����: " + userAge);

		
		System.out.println("----------------------------------------");
		
		
		DBMemberDTO member2 = new DBMemberDTO();
		Scanner scn = new Scanner(System.in);
		
		System.out.print("���̵�: ");
		userId=scn.next();
		
		System.out.print("���: ");
		userPw=scn.next();
		
		System.out.print("����: ");
		userAge=scn.nextInt();
		
		member2.setUserId(userId);
		member2.setUserPw(userPw);
		member2.setUserAge(userAge);
		
		System.out.println("���̵�: " + userId);
		System.out.println("���: " + userPw);
		System.out.println("����: " + userAge);
	}
}



