package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDto.MemberDto;

public class ActionInsertDo implements QueryCommend {

	@Override
	public void excuteCommend() {
		// TODO Auto-generated method stub
		System.out.println("회원 가입 Commend");

		Scanner scn = new Scanner(System.in);

		System.out.println("아이디 입력: ");
		String userId = scn.next();

		System.out.println("비밀번호 입력: ");
		String userPw = scn.next();

		System.out.println("이름 입력: ");
		String userName = scn.next();

		MemberDto member = new MemberDto(userId, userPw, userName);

		System.out.println("아이디 : " + member.getUserId());
		System.out.println("비밀번호 : " + member.getUserId());
		System.out.println("이름 : " + member.getUserName());
		
		
	}
}
