package org.java.membercommend;

import java.util.Scanner;

import org.java.memberdao.MemberDao;

public class ActionUpdateDo implements QueryCommend {

	@Override
	public void excuteQueryCommend() {

		System.out.println("ȸ�� ���� Commend");

		Scanner scn = new Scanner(System.in);

		System.out.println("���̵� �Է�:");
		String userId = scn.next();

		System.out.println("�����ȣ �Է�:");
		String userPw = scn.next();

		System.out.println("�̸� �Է�:");
		String userName = scn.next();

		System.out.println("���� �Է�:");
		int userAge = scn.nextInt();

		MemberDao dao = new MemberDao();
		int result = dao.updateDo(userId, userPw, userName, userAge);

		if (result == 1) {
			System.out.println("ȸ�� ���� ����");
		} else {
			System.out.println("ȸ�� ���� ����");
		}

	}
}









