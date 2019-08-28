package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDto.MemberDto;

/*class Query{
	Scanner scn = new Scanner(System.in);
	String a=scn.next();
	
	if(a.equals("네")){
		
	}
}
*/


public class ActionDeleteDo implements QueryCommend{

	@Override
	public void excuteCommend() {
		// TODO Auto-generated method stub
		System.out.println("회원 탈퇴 Commend");
		
		Scanner scn = new Scanner(System.in);
		System.out.println("탈퇴를 원하는 아이디와 비밀번호를 입력해주세요.");
		
		System.out.println("아이디 입력: ");
		String userId = scn.next();
		
		System.out.println("비밀번호 입력: ");
		String userPw = scn.next();
		
		MemberDto member = new MemberDto(userId, userPw);
		
		if(member.getUserId().equals("DbUserId") && member.getUserPw().equals("DbUserPw")) {
			
			System.out.println("탈퇴가 완료되었습니다.");
		}else {
			System.out.println("없는 아이디 또는 비밀번호 입니다.");
		}
		
	}
}


/*두가지 방법으로 구현
 * 1.회원탈퇴 신청 (아이디+비밀번호) 
 * 
 */
