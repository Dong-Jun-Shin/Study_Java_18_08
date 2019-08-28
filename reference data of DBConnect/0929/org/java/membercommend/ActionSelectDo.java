package org.java.membercommend;

import java.util.ArrayList;

import org.java.memberdao.MemberDao;
import org.java.memberdto.MemberDto;

public class ActionSelectDo implements QueryCommend {

	@Override
	public void excuteQueryCommend() {

		System.out.println("회원 조회 Commend");

		MemberDao dao = new MemberDao();
		ArrayList<MemberDto> members = dao.selectDo();

		for (MemberDto dto : members) {

			String userId = dto.getUserId();
			String userPw = dto.getUserPw();
			String userName = dto.getUserName();
			int userAge = dto.getUserAge();

			System.out.print("아이디: " + userId + ", ");
			System.out.print("비빌번호: " + userPw + ", ");
			System.out.print("이름: " + userName + ", ");
			System.out.println("나이: " + userAge);

		}

	}
}
