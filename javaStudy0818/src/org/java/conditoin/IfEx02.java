package org.java.conditoin;

import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {

		System.out.println("if문 조건이 두개");

		Scanner scn = new Scanner(System.in);

		System.out.println("아이디 입력");
		String userId = scn.next();

		System.out.println("비밀번호 입력");
		String userPw = scn.next();

		if (userId.equals("manso") && userPw.equals("1111")) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

		System.out.println();

		if (userId.equals("manso") && userPw.equals("1111")) {
			System.out.println("로그인 성공");
		} else if (!userId.equals("manso") || !userPw.equals("1111")) {
			System.out.println("로그인 실패");
		}
	}
}
