package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDto.MemberDto;

public class ActionUpdateDo implements QueryCommend{

	@Override
	public void excuteCommend() {
		// TODO Auto-generated method stub
		System.out.println("ȸ�� ���� Commend");
		
		
		
		Scanner scn= new Scanner(System.in);
		
		System.out.println("���̵� �Է�: ");
		String userId = scn.next();
		
		System.out.println("��й�ȣ �Է�: ");
		String userPw = scn.next();
		
		System.out.println("�̸� �Է�: ");
		String userName = scn.next();
		
		MemberDto member = new MemberDto(userId, userPw, userName);
		
		System.out.println("���̵� : " + member.getUserId());
		System.out.println("��й�ȣ : " + member.getUserId());
		System.out.println("�̸� : " + member.getUserName());
		
	}
}

//���ϴ� �κи� �����ؼ� ������ �� �ְ� �����غ���