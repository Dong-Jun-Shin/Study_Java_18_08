package org.java.memberCommend;

import org.java.memberDto.MemberDto;

public class ActionSelectDo implements QueryCommend{

	@Override
	public void excuteCommend() {
		// TODO Auto-generated method stub
		System.out.println("회원 조회 Commend");
		
		
		MemberDto member1=new MemberDto("DbUserId1", "DbUserPw1", "DbUserName1");
		System.out.println("아이디 : " + member1.getUserId());
		System.out.println("비밀번호 : " + member1.getUserId());
		System.out.println("이름 : " + member1.getUserName());
		
		MemberDto member2=new MemberDto("DbUserId2", "DbUserPw2", "DbUserName2");
		System.out.println("아이디 : " + member2.getUserId());
		System.out.println("비밀번호 : " + member2.getUserId());
		System.out.println("이름 : " + member2.getUserName());
		
		MemberDto member3=new MemberDto("DbUserId3", "DbUserPw3", "DbUserName3");
		System.out.println("아이디 : " + member3.getUserId());
		System.out.println("비밀번호 : " + member3.getUserId());
		System.out.println("이름 : " + member3.getUserName());
		
	}

}
