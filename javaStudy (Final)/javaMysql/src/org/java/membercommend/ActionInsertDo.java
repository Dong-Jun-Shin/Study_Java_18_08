package org.java.membercommend;

import java.util.Scanner;

import org.java.memberdao.MemberDao;

public class ActionInsertDo implements QueryCommend {

	@Override
	public void excuteQueryCommend() {

		System.out.println("ȸ�� ���� Commend");

		Scanner scn = new Scanner(System.in);

		System.out.println("���̵� �Է�: ");
		String userId = scn.next();

		System.out.println("��й�ȣ �Է�: ");
		String userPw = scn.next();

		System.out.println("�̸� �Է�: ");
		String userName = scn.next();

		System.out.println("���� �Է�: ");
		int userAge = scn.nextInt();
		
		System.out.println("���� �Է�: ");
		String userGender = scn.next();
		
		System.out.println("��ȭ��ȣ �Է�: ");
		String userPhone = scn.next();
		
		System.out.println("��� �Է�: ");
		String userHobbys = scn.next();

		MemberDao dao = new MemberDao();
		int result = dao.insertDo(userId, userPw, userName, userAge, userGender, userPhone, userHobbys);

		if (result == 1) {
			System.out.println("ȸ������ �Ϸ�");
		} else {
			System.out.println("ȸ������ ����");
		}

	}
}
