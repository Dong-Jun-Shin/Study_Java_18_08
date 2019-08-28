package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDao.MemberDao;

public class ActionDeleteDo implements QueryCommend {

	@Override
	public void excuteQueryCommend() {
		System.out.println("회원 삭제 Commend");

		Scanner scn = new Scanner(System.in);

		System.out.println("삭제할 아이디를 입력 : ");
		String userId = scn.next();
		
		MemberDao dao = new MemberDao();
		int result = dao.deleteDo(userId);
		
		if(result==1) {
			System.out.println("회원삭제 완료");
		}else {
			System.out.println("회원삭제 실패");
		}
		
	}
}
