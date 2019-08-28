package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDto.MemberDto;

public class ActionUpdateDo implements QueryCommend{

	@Override
	public void excuteCommend() {
		// TODO Auto-generated method stub
		System.out.println("회원 수정 Commend");
		
		
		
		Scanner scn= new Scanner(System.in);
		
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

//원하는 부분만 선택해서 수정할 수 있게 구상해보기