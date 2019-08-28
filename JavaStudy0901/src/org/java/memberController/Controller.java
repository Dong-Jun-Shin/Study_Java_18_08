package org.java.memberController;

import java.util.Scanner;

import org.java.memberCommend.ActionDeleteDo;
import org.java.memberCommend.ActionInsertDo;
import org.java.memberCommend.ActionSelectDo;
import org.java.memberCommend.ActionUpdateDo;

public class Controller {

	public static void main(String[] args) {

		System.out.println("쿼리문을 입력하시오. (가입, 수정, 탈퇴, 조회)");

		Scanner scn = new Scanner(System.in);
		String query = scn.next();

		if (query.equals("가입")) {
			ActionInsertDo action = new ActionInsertDo();
			action.excuteQueryCommend();
			
		} else if (query.equals("수정")) {
			ActionUpdateDo action = new ActionUpdateDo();
			action.excuteQueryCommend();
			
		} else if (query.equals("탈퇴")) {
			ActionDeleteDo action = new ActionDeleteDo();
			action.excuteQueryCommend();
			
		} else if (query.equals("조회")) {
			ActionSelectDo action = new ActionSelectDo();
			action.excuteQueryCommend();
		}
	}
}
