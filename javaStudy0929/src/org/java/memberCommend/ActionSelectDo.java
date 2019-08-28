package org.java.memberCommend;

import java.util.ArrayList;

import org.java.memberDao.MemberDao;
import org.java.memberDto.MemberDto;

public class ActionSelectDo implements QueryCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원 조회 Commend");
		
		MemberDao dao = new MemberDao();
		ArrayList<MemberDto> members=dao.selectDo();
		
		for(MemberDto dto:members) {
			String userId=dto.getUserId();
			String userPw=dto.getUserPw();
			String userName=dto.getUserName();
			int userAge=dto.getUserAge();
			
			System.out.print("아이디: "+userId+", ");
			System.out.print("비밀번호: "+userPw+", ");
			System.out.print("이름: "+userName+", ");
			System.out.println("나이: "+userAge+" ");
		}
	}
}