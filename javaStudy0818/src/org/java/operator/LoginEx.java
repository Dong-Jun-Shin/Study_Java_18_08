package org.java.operator;

import java.util.Scanner;

public class LoginEx {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
				
		System.out.println("아이디 입력");
		String userId=scn.next();
		
		System.out.println("비밀번호 입력");
		String userPw=scn.next();

		if(userId.equals("manso") && userPw.equals("1111")) {
			System.out.println("자유에요!!");
		}else {
			System.out.println("탈출에 실패해버렸어요 ㅜ_ㅜ");
		}
	}
}
