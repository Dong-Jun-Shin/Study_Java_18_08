package org.java.memberController;

import java.util.Scanner;

import org.java.memberCommend.ActionDeleteDo;
import org.java.memberCommend.ActionInsertDo;
import org.java.memberCommend.ActionSelectDo;
import org.java.memberCommend.ActionUpdateDo;
import org.java.memberCommend.QueryCommend;

public class MemberController {

	public static void main(String[] args) {
		
		System.out.println("쿼리문을 입력하세요.(Insert, Delete, Update, Select");
		
		Scanner scn=new Scanner(System.in);
		boolean bool = false;
		QueryCommend action = null;
		
		while(!bool) {
			String query = scn.next();
			
			if(query.equals("Insert")) {
				action = new ActionInsertDo();
				action.excuteQueryCommend();
				System.out.println("계속하려면 입력하세요. 그만두려면 exit를 입력하세요.");
				
				
			} else if(query.equals("Delete")) {
				action = new ActionDeleteDo();
				action.excuteQueryCommend();
				System.out.println("계속하려면 입력하세요. 그만두려면 exit를 입력하세요.");
				
			} else if(query.equals("Update")) {
				action = new ActionUpdateDo();
				action.excuteQueryCommend();
				System.out.println("계속하려면 입력하세요. 그만두려면 exit를 입력하세요.");
				
			} else if(query.equals("Select")) {
				action = new ActionSelectDo();
				action.excuteQueryCommend();
				System.out.println("계속하려면 입력하세요. 그만두려면 exit를 입력하세요.");
				
			} else if(query.equals("exit")) {
				System.out.println("쿼리문 종료");
				bool = true;
			} else {
				System.out.println("잘못 입력했습니다.");
			}
		}
		
	}
}
