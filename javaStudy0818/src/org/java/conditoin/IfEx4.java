package org.java.conditoin;

import java.util.Scanner;

public class IfEx4 {

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

			Calculator cal1 = new Calculator(num1, num2);

			if (op.equals("+")) {
				cal1.add();
			} else if (op.equals("-")) {
				cal1.sub();
			} else if (op.equals("*")) {
				cal1.multi();
			} else if (op.equals("/")) {
				cal1.div();
			} else {
				System.err.println("���� ��ȣ �Է� ����");
				System.out.println();
				System.out.println();
			}
		}
	}
}