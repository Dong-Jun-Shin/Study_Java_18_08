package org.java.membercommend;

import java.util.Scanner;

import org.java.memberdao.MemberDao;

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
		
		System.out.println("성별 입력: ");
		String userGender = scn.next();
		
		System.out.println("전화번호 입력: ");
		String userPhone = scn.next();
		
		System.out.println("취미 입력: ");
		String userHobbys = scn.next();

		MemberDao dao = new MemberDao();
		int result = dao.insertDo(userId, userPw, userName, userAge, userGender, userPhone, userHobbys);

		if (result == 1) {
			System.out.println("회원가입 완료");
		} else {
			System.out.println("회원가입 실패");
		}

	}
}
