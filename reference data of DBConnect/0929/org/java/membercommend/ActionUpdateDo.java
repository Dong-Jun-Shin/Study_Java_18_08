package org.java.membercommend;

import java.util.Scanner;

import org.java.memberdao.MemberDao;

public class ActionUpdateDo implements QueryCommend {

	@Override
	public void excuteQueryCommend() {

		System.out.println("회원 수정 Commend");

		Scanner scn = new Scanner(System.in);

		System.out.println("아이디 입력:");
		String userId = scn.next();

		System.out.println("비빌번호 입력:");
		String userPw = scn.next();

		System.out.println("이름 입력:");
		String userName = scn.next();

		System.out.println("나이 입력:");
		int userAge = scn.nextInt();

		MemberDao dao = new MemberDao();
		int result = dao.updateDo(userId, userPw, userName, userAge);

		if (result == 1) {
			System.out.println("회원 수정 성공");
		} else {
			System.out.println("회원 수정 실패");
		}

	}
}









