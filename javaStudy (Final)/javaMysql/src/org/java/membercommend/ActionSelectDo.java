package org.java.membercommend;

import java.util.ArrayList;

import org.java.memberdao.MemberDao;
import org.java.memberdto.MemberDto;

public class ActionSelectDo implements QueryCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("ȸ�� ��ȸ Commend");
		
		MemberDao dao = new MemberDao();
		ArrayList<MemberDto> members=dao.selectDo();
		
		//for each�� ���
		for(MemberDto dto:members) {
			String userId=dto.getUserId();
			String userPw=dto.getUserPw();
			String userName=dto.getUserName();
			int userAge=dto.getUserAge();
			String userGender=dto.getUserGender();
			String userPhone=dto.getUserPhone();
			String userHobbys=dto.getUserHobbys();
			
			System.out.print("���̵�: "+userId+", ");
			System.out.print("��й�ȣ: "+userPw+", ");
			System.out.print("�̸�: "+userName+", ");
			System.out.print("����: "+userAge+" ");
			System.out.print("����: "+userGender+", ");
			System.out.print("��ȭ��ȣ: "+userPhone+", ");
			System.out.println("���: "+userHobbys+" ");
		}
	}
}