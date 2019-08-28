//JS.0901 ����
package org.java.commend;

import java.util.Scanner;

public class ActionController {

	public static void main(String[] args) {
		// �������� ���� ��
		ActionInsertDo Insert = new ActionInsertDo();
		Insert.excuteQueryCommend();

		ActionUpdateDo Update = new ActionUpdateDo();
		Update.excuteQueryCommend();

		ActionDeleteDo Delete = new ActionDeleteDo();
		Delete.excuteQueryCommend();

		ActionSelectDo Select = new ActionSelectDo();
		Select.excuteQueryCommend();

		System.out.println("=======================");

		// �������� �����ؼ� �ܼ�ȭ
		ActionQueryCommend action1 = new ActionInsertDo();
		action1.excuteQueryCommend();

		ActionQueryCommend action2 = new ActionUpdateDo();
		action2.excuteQueryCommend();

		ActionQueryCommend action3 = new ActionDeleteDo();
		action3.excuteQueryCommend();

		ActionQueryCommend action4 = new ActionSelectDo();
		action4.excuteQueryCommend();

		System.out.println("=======================");

		// ��ĳ�ʸ� �̿��ؼ� �ܼ�ȭ
		System.out.println("�������� �Է��ϼ���. (Insert, Update, Delete, Select)");

		Scanner scn = new Scanner(System.in);
		String query = scn.next();

		ActionQueryCommend action=null;

		if (query.equals("Insert")) {
			action = new ActionInsertDo();
			action.excuteQueryCommend();
			
		} else if (query.equals("Update")) {
			action = new ActionUpdateDo();
			action.excuteQueryCommend();
			
		} else if (query.equals("Delete")) {
			action = new ActionDeleteDo();
			action.excuteQueryCommend();
			
		} else if (query.equals("Select")) {
			action = new ActionSelectDo();
			action.excuteQueryCommend();
		}

	}
}
