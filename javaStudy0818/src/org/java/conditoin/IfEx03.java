package org.java.conditoin;

import java.util.Scanner;

public class IfEx03 {

	public static void main(String[] args) {
		System.out.println("������ 2�� �̻�");

		// +�Է� -> +����
		// -�Է� -> -����
		// *�Է� -> *����
		// /�Է� -> /����

		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("ù��° ����(����) �Է�");
			int num1 = scn.nextInt();

			System.out.println("�ι�° ����(����) �Է�");
			int num2 = scn.nextInt();

			System.out.println("�����ڸ� �Է�(+, -, *, /)");
			String op = scn.next();

			if (op.equals("+")) {
				System.err.println("����: " + num1 + " + " + num2 + " = " + (num1 + num2));
			} else if (op.equals("-")) {
				System.err.println("����: " + num1 + " - " + num2 + " = " + (num1 - num2));
			} else if (op.equals("*")) {
				System.err.println("���ϱ�: " + num1 + " * " + num2 + " = " + (num1 * num2));
			} else if (op.equals("/")) {
				System.err.println("������: " + num1 + " / " + num2 + " = " + (num1 / num2));
			} else {
				System.err.println("���� ��ȣ �Է� ����");
				System.out.println();
				System.out.println();
			}

		}
	}
}
