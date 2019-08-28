package org.java.memberController;

import java.util.Scanner;

import org.java.memberCommend.ActionDeleteDo;
import org.java.memberCommend.ActionInsertDo;
import org.java.memberCommend.ActionQueryCommend;
import org.java.memberCommend.ActionSelectDo;
import org.java.memberCommend.ActionUpdateDo;
import org.java.memberCommend.QueryCommend;

public class MemberController {

	public static void main(String[] args) {

		// *다형성으로 슈퍼 객체참조변수 = new 서브 생성자*

		System.out.println("쿼리문을 입력하세요. (insert, update, select, delete / exit)");

		Scanner scn = new Scanner(System.in);
		boolean bool = false;
		String query = "";
		QueryCommend action = null; // *객체 참조 (다형성) *

		while (!bool) {
			query = scn.next(); // Scanner 입력

			if (query.equals("insert")) {
				// 회원 가입
				action = new ActionInsertDo();
				action.excuteCommend();
				System.out.println("계속하려면 입력하세요. 그만하시려면 exit를 입력하세요.");

			} else if (query.equals("delete")) {
				// 회원 탈퇴
				action = new ActionDeleteDo();
				action.excuteCommend();
				System.out.println("계속하려면 입력하세요. 그만하시려면 exit를 입력하세요.");

			} else if (query.equals("update")) {
				// 회원 수정
				action = new ActionUpdateDo();
				action.excuteCommend();
				System.out.println("계속하려면 입력하세요. 그만하시려면 exit를 입력하세요.");

			} else if (query.equals("select")) {
				// 회원 조회
				action = new ActionSelectDo();
				action.excuteCommend();
				System.out.println("계속하려면 입력하세요. 그만하시려면 exit를 입력하세요.");

			} else if (query.equals("exit")) {
				System.out.println("쿼리문 종료");
				bool = true;

			} else {
				System.out.println("잘못 입력했어요. 다시 입력하세요.");
			}
		}
	}

}
