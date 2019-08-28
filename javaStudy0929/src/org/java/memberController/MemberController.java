package org.java.memberController;

import java.util.Scanner;

import org.java.memberCommend.ActionDeleteDo;
import org.java.memberCommend.ActionInsertDo;
import org.java.memberCommend.ActionSelectDo;
import org.java.memberCommend.ActionUpdateDo;
import org.java.memberCommend.QueryCommend;

public class MemberController {

	public static void main(String[] args) {
		
		System.out.println("�������� �Է��ϼ���.(Insert, Delete, Update, Select");
		
		Scanner scn=new Scanner(System.in);
		boolean bool = false;
		QueryCommend action = null;
		
		while(!bool) {
			String query = scn.next();
			
			if(query.equals("Insert")) {
				action = new ActionInsertDo();
				action.excuteQueryCommend();
				System.out.println("����Ϸ��� �Է��ϼ���. �׸��η��� exit�� �Է��ϼ���.");
				
				
			} else if(query.equals("Delete")) {
				action = new ActionDeleteDo();
				action.excuteQueryCommend();
				System.out.println("����Ϸ��� �Է��ϼ���. �׸��η��� exit�� �Է��ϼ���.");
				
			} else if(query.equals("Update")) {
				action = new ActionUpdateDo();
				action.excuteQueryCommend();
				System.out.println("����Ϸ��� �Է��ϼ���. �׸��η��� exit�� �Է��ϼ���.");
				
			} else if(query.equals("Select")) {
				action = new ActionSelectDo();
				action.excuteQueryCommend();
				System.out.println("����Ϸ��� �Է��ϼ���. �׸��η��� exit�� �Է��ϼ���.");
				
			} else if(query.equals("exit")) {
				System.out.println("������ ����");
				bool = true;
			} else {
				System.out.println("�߸� �Է��߽��ϴ�.");
			}
		}
		
	}
}
