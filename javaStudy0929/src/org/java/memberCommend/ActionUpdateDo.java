package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDao.MemberDao;

public class ActionUpdateDo implements QueryCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원 수정 Commend");

		Scanner scn = new Scanner(System.in);

		System.out.println("변경을 원하는 아이디 입력: ");
		String userId = scn.next();

		System.out.println("변경할 비밀번호 입력: ");
		String userPw = scn.next();

		System.out.println("변경할 이름 입력: ");
		String userName = scn.next();

		System.out.println("변경할 나이 입력: ");
		int userAge = scn.nextInt();
		
		MemberDao dao = new MemberDao();
		int result = dao.updateDo(userId, userPw, userName, userAge);

		if (result == 1) {
			System.out.println("회원수정 완료");
		} else {
			System.out.println("회원수정 실패");
		}
	}
}
