package org.java.membercommend;

import java.util.Scanner;

import org.java.memberdao.MemberDao;

public class ActionDeleteDo implements QueryCommend {

	@Override
	public void excuteQueryCommend() {

		System.out.println("ȸ�� Ż�� Commend");

		Scanner scn = new Scanner(System.in);

		System.out.println("���̵� �Է�:");
		String userId = scn.next();

		MemberDao dao = new MemberDao();
		int result = dao.deleteDo(userId);
		if (result == 1) {
			System.out.println("ȸ�� Ż�� ����");
		} else {
			System.out.println("ȸ�� Ż�� ����");
		}

	}
}
