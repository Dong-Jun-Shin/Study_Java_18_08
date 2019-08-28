package org.java.memberCommend;

import java.util.ArrayList;

import org.java.memberDao.MemberDao;
import org.java.memberDto.MemberDto;

public class ActionSelectDo implements QueryCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("ȸ�� ��ȸ Commend");
		
		MemberDao dao = new MemberDao();
		ArrayList<MemberDto> members=dao.selectDo();
		
		for(MemberDto dto:members) {
			String userId=dto.getUserId();
			String userPw=dto.getUserPw();
			String userName=dto.getUserName();
			int userAge=dto.getUserAge();
			
			System.out.print("���̵�: "+userId+", ");
			System.out.print("��й�ȣ: "+userPw+", ");
			System.out.print("�̸�: "+userName+", ");
			System.out.println("����: "+userAge+" ");
		}
	}
}