package org.java.conditoin;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		System.out.println("switch문");

		Scanner scn = new Scanner(System.in);
		System.out.println("쿼리문을 입력하세요(insert, update, select, delete)");

		String result = scn.next();
		
		switch (result) {
		case "insert":
			System.out.println("회원 가입");
			break;
		case "update":
			System.out.println("회원 수정");
			break;
		case "select":
			System.out.println("회원 탈퇴");
			break;
		case "delete":
			System.out.println("회원 조회");
			break;
		default:
			System.out.println("다시 눌러");
			return;
		}
	}
}