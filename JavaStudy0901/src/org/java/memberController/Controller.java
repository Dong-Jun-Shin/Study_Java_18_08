package org.java.memberController;

import java.util.Scanner;

import org.java.memberCommend.ActionDeleteDo;
import org.java.memberCommend.ActionInsertDo;
import org.java.memberCommend.ActionSelectDo;
import org.java.memberCommend.ActionUpdateDo;

public class Controller {

	public static void main(String[] args) {

		System.out.println("�������� �Է��Ͻÿ�. (����, ����, Ż��, ��ȸ)");

		Scanner scn = new Scanner(System.in);
		String query = scn.next();

		if (query.equals("����")) {
			ActionInsertDo action = new ActionInsertDo();
			action.excuteQueryCommend();
			
		} else if (query.equals("����")) {
			ActionUpdateDo action = new ActionUpdateDo();
			action.excuteQueryCommend();
			
		} else if (query.equals("Ż��")) {
			ActionDeleteDo action = new ActionDeleteDo();
			action.excuteQueryCommend();
			
		} else if (query.equals("��ȸ")) {
			ActionSelectDo action = new ActionSelectDo();
			action.excuteQueryCommend();
		}
	}
}
