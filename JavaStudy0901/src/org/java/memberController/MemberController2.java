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
		
		System.out.println("�������� �Է��Ͻÿ�. (����, ����, Ż��, ��ȸ)");
		String query=scn.next();
		
		ActionQueryCommend action; //��������
		
		if (query.equals("����")) {
			action = new ActionInsertDo();
			action.excuteQueryCommend();
			
		} else if (query.equals("����")) {
			action = new ActionUpdateDo();
			action.excuteQueryCommend();
			
		} else if (query.equals("Ż��")) {
			action = new ActionDeleteDo();
			action.excuteQueryCommend();
			
		} else if (query.equals("��ȸ")) {
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