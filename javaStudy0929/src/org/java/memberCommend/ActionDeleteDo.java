package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDao.MemberDao;

public class ActionDeleteDo implements QueryCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("ȸ�� ���� Commend");

		Scanner scn = new Scanner(System.in);

		System.out.println("������ ���̵� �Է� : ");
		String userId = scn.next();
		
		MemberDao dao = new MemberDao();
		int result = dao.deleteDo(userId);
		
		if(result==1) {
			System.out.println("ȸ������ �Ϸ�");
		}else {
			System.out.println("ȸ������ ����");
		}
		
	}
}
