package org.java.operator;

import java.util.Scanner;

public class OperatorEx05 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요");
		String userId=scn.next(); //문자열을 입력
		
		System.out.println("패스워드를 입력하세요");
		String userPw=scn.next(); //문자열을 입력
		
		System.out.println("아이디: "+userId);
		System.out.println("비밀번호: "+userPw);
		
		System.out.println(userId.equals("manso"));
		System.out.println(userPw.equals("1111"));
		
		
		if(userId.equals("manso")) {
			System.out.println("아이디가 맞습니다.");
		}else {
			System.out.println("아이디가 틀립니다.");
		}
		
		if(userPw.equals("1111")) {
			System.out.println("비밀번호가 맞습니다.");
		}else {
			System.out.println("비밀번호가 틀립니다.");
		}
		
		if(userId.equals("manso")&&userPw.equals("1111")) {
			System.out.println("로그인 되었습니다.");
		}else {
			System.out.println("아이디 또는 비밀번호가 틀립니다.");
		}
		
		
	}
}
