package org.java.memberController;

import java.util.Scanner;

import org.java.memberCommend.ActionDeleteDo;
import org.java.memberCommend.ActionInsertDo;
import org.java.memberCommend.ActionSelectDo;
import org.java.memberCommend.ActionUpdateDo;
import org.java.memberCommend.QueryCommend;

//실습해보기
public class Controller {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		String query="";
		
		boolean bool= false;
		
		
		while(!bool) {
			
			System.out.println("쿼리문 입력");
			
			query=scn.next();
			
			QueryCommend action = null;
			
			if(query.equals("insert")) {
				action = new ActionInsertDo();
				action.excuteCommend();
				
			}else if(query.equals("update")){
				action = new ActionUpdateDo();
				action.excuteCommend();
				
			}else if(query.equals("delete")) {
				action = new ActionDeleteDo();
				action.excuteCommend();
				
			}else if(query.equals("select")) {
				action = new ActionSelectDo();
				action.excuteCommend();
				
			}else if(query.equals("exit")) {
				
				System.out.println("종료");
				bool = true;
			}else { 
				System.out.println("잘못입력");
				
			}
		}
	}
}
