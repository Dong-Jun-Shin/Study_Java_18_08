package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDto.MemberDto;

/*class Query{
	Scanner scn = new Scanner(System.in);
	String a=scn.next();
	
	if(a.equals("��")){
		
	}
}
*/


public class ActionDeleteDo implements QueryCommend{

	@Override
	public void excuteCommend() {
		// TODO Auto-generated method stub
		System.out.println("ȸ�� Ż�� Commend");
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Ż�� ���ϴ� ���̵�� ��й�ȣ�� �Է����ּ���.");
		
		System.out.println("���̵� �Է�: ");
		String userId = scn.next();
		
		System.out.println("��й�ȣ �Է�: ");
		String userPw = scn.next();
		
		MemberDto member = new MemberDto(userId, userPw);
		
		if(member.getUserId().equals("DbUserId") && member.getUserPw().equals("DbUserPw")) {
			
			System.out.println("Ż�� �Ϸ�Ǿ����ϴ�.");
		}else {
			System.out.println("���� ���̵� �Ǵ� ��й�ȣ �Դϴ�.");
		}
		
	}
}


/*�ΰ��� ������� ����
 * 1.ȸ��Ż�� ��û (���̵�+��й�ȣ) 
 * 
 */
