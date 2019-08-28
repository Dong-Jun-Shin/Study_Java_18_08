package org.java.membercontroller;

import java.util.Scanner;

import org.java.membercommend.ActionDeleteDo;
import org.java.membercommend.ActionInsertDo;
import org.java.membercommend.ActionSelectDo;
import org.java.membercommend.ActionUpdateDo;
import org.java.membercommend.QueryCommend;

public class MemberController {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String query = "";

		QueryCommend action;

		boolean bool = false;

		while (!bool) {

			query = scn.next();

			if (query.equals("insert")) {
				action = new ActionInsertDo();
				action.excuteQueryCommend();
			} else if (query.equals("update")) {
				action = new ActionUpdateDo();
				action.excuteQueryCommend();
			} else if (query.equals("delete")) {
				action = new ActionDeleteDo();
				action.excuteQueryCommend();
			} else if (query.equals("select")) {
				action = new ActionSelectDo();
				action.excuteQueryCommend();
			} else if (query.equals("exit")) {
				System.out.println("종료합니다..");
				bool = true;
			} else {
				System.out.println("쿼리문에러.. 다시 입력하세요");
			}

		}

	}
}
