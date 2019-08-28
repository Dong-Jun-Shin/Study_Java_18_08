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

		// *���������� ���� ��ü�������� = new ���� ������*

		System.out.println("�������� �Է��ϼ���. (insert, update, select, delete / exit)");

		Scanner scn = new Scanner(System.in);
		boolean bool = false;
		String query = "";
		QueryCommend action = null; // *��ü ���� (������) *

		while (!bool) {
			query = scn.next(); // Scanner �Է�

			if (query.equals("insert")) {
				// ȸ�� ����
				action = new ActionInsertDo();
				action.excuteCommend();
				System.out.println("����Ϸ��� �Է��ϼ���. �׸��Ͻ÷��� exit�� �Է��ϼ���.");

			} else if (query.equals("delete")) {
				// ȸ�� Ż��
				action = new ActionDeleteDo();
				action.excuteCommend();
				System.out.println("����Ϸ��� �Է��ϼ���. �׸��Ͻ÷��� exit�� �Է��ϼ���.");

			} else if (query.equals("update")) {
				// ȸ�� ����
				action = new ActionUpdateDo();
				action.excuteCommend();
				System.out.println("����Ϸ��� �Է��ϼ���. �׸��Ͻ÷��� exit�� �Է��ϼ���.");

			} else if (query.equals("select")) {
				// ȸ�� ��ȸ
				action = new ActionSelectDo();
				action.excuteCommend();
				System.out.println("����Ϸ��� �Է��ϼ���. �׸��Ͻ÷��� exit�� �Է��ϼ���.");

			} else if (query.equals("exit")) {
				System.out.println("������ ����");
				bool = true;

			} else {
				System.out.println("�߸� �Է��߾��. �ٽ� �Է��ϼ���.");
			}
		}
	}

}
