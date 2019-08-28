package org.java.DBMemberController;

import java.util.Scanner;

import org.java.DBMemberDTO.DBMemberDTO;

public class DBMemberController {

	public static void main(String[] args) {
		
		System.out.println("예시입니다. 아래와 같이 입력해주세요.");
		
		DBMemberDTO member1 = new DBMemberDTO();
		

		member1.setUserId("manso1");
		String userId = member1.getUserId();//
		System.out.println("아이디: " + userId);

		member1.setUserPw("1111");
		String userPw = member1.getUserPw();//
		System.out.println("비번: " + userPw);

		member1.setUserAge(17);
		int userAge = member1.getUserAge();//
		System.out.println("나이: " + userAge);

		
		System.out.println("----------------------------------------");
		
		
		DBMemberDTO member2 = new DBMemberDTO();
		Scanner scn = new Scanner(System.in);
		
		System.out.print("아이디: ");
		userId=scn.next();
		
		System.out.print("비번: ");
		userPw=scn.next();
		
		System.out.print("나이: ");
		userAge=scn.nextInt();
		
		member2.setUserId(userId);
		member2.setUserPw(userPw);
		member2.setUserAge(userAge);
		
		System.out.println("아이디: " + userId);
		System.out.println("비번: " + userPw);
		System.out.println("나이: " + userAge);
	}
}



