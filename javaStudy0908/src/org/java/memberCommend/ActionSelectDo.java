package org.java.memberCommend;

import org.java.memberDto.MemberDto;

public class ActionSelectDo implements QueryCommend{

	@Override
	public void excuteCommend() {
		// TODO Auto-generated method stub
		System.out.println("ȸ�� ��ȸ Commend");
		
		
		MemberDto member1=new MemberDto("DbUserId1", "DbUserPw1", "DbUserName1");
		System.out.println("���̵� : " + member1.getUserId());
		System.out.println("��й�ȣ : " + member1.getUserId());
		System.out.println("�̸� : " + member1.getUserName());
		
		MemberDto member2=new MemberDto("DbUserId2", "DbUserPw2", "DbUserName2");
		System.out.println("���̵� : " + member2.getUserId());
		System.out.println("��й�ȣ : " + member2.getUserId());
		System.out.println("�̸� : " + member2.getUserName());
		
		MemberDto member3=new MemberDto("DbUserId3", "DbUserPw3", "DbUserName3");
		System.out.println("���̵� : " + member3.getUserId());
		System.out.println("��й�ȣ : " + member3.getUserId());
		System.out.println("�̸� : " + member3.getUserName());
		
	}

}
