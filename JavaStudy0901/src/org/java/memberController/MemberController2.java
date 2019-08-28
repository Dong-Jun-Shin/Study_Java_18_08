package org.java.memberController;

import java.util.Scanner;

import org.java.memberCommend.ActionDeleteDo;
import org.java.memberCommend.ActionInsertDo;
import org.java.memberCommend.ActionQueryCommend;
import org.java.memberCommend.ActionSelectDo;
import org.java.memberCommend.ActionUpdateDo;

public class MemberController2 {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		System.out.println("쿼리문을 입력하시오. (가입, 수정, 탈퇴, 조회)");
		String query=scn.next();
		
		ActionQueryCommend action; //변수선언
		
		if (query.equals("가입")) {
			action = new ActionInsertDo();
			action.excuteQueryCommend();
			
		} else if (query.equals("수정")) {
			action = new ActionUpdateDo();
			action.excuteQueryCommend();
			
		} else if (query.equals("탈퇴")) {
			action = new ActionDeleteDo();
			action.excuteQueryCommend();
			
		} else if (query.equals("조회")) {
			action = new ActionSelectDo();
			action.excuteQueryCommend();
		}
		
		/*
		ActionQueryCommend action1=new ActionDeleteDo();
		action1.excuteQueryCommend();
		
		ActionQueryCommend action2=new ActionInsertDo();
		action2.excuteQueryCommend();
		
		ActionQueryCommend action3=new ActionUpdateDo();
		action3.excuteQueryCommend();
		
		ActionQueryCommend action4=new ActionSelectDo();
		action4.excuteQueryCommend();
		*/
		
	}
}