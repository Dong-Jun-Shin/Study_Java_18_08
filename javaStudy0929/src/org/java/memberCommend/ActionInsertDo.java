package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDao.MemberDao;

public class ActionInsertDo implements QueryCommend {

	@Override
	public void excuteQueryCommend() {

		System.out.println("회원 가입 Commend");

		Scanner scn = new Scanner(System.in);

		System.out.println("아이디 입력: ");
		String userId = scn.next();

		System.out.println("비밀번호 입력: ");
		String userPw = scn.next();

		System.out.println("이름 입력: ");
		String userName = scn.next();

		System.out.println("나이 입력: ");
		int userAge = scn.nextInt();

		MemberDao dao = new MemberDao();
		int result = dao.insertDo(userId, userPw, userName, userAge);

		if (result == 1) {
			System.out.println("회원가입 완료");
		} else {
			System.out.println("회원가입 실패");
		}

	}
}
