package org.java.conditoin;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		System.out.println("switch��");

		Scanner scn = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ���(insert, update, select, delete)");

		String result = scn.next();
		
		switch (result) {
		case "insert":
			System.out.println("ȸ�� ����");
			break;
		case "update":
			System.out.println("ȸ�� ����");
			break;
		case "select":
			System.out.println("ȸ�� Ż��");
			break;
		case "delete":
			System.out.println("ȸ�� ��ȸ");
			break;
		default:
			System.out.println("�ٽ� ����");
			return;
		}
	}
}