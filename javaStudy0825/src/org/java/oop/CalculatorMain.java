package org.java.oop;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator cal1 = new Calculator();
		Scanner scn = new Scanner(System.in);

		boolean bool = false;

		System.out.println("ù��° ���ڸ� �Է��϶�.");
		cal1.setNum1(scn.nextInt());

		System.out.println("�ι�° ���ڸ� �Է��϶�.");
		cal1.setNum2(scn.nextInt());
		
		while (!bool) {
			System.out.println("�����ȣ�� �Է��϶�. (end - ������)");
			String M = scn.next();

			if (M.equals("+")) {
				cal1.add();

			} else if (M.equals("-")) {
				cal1.sub();

			} else if (M.equals("*")) {
				cal1.multi();

			} else if (M.equals("/")) {
				cal1.div();

			} else if (M.equals("end")) {
				System.out.println("-------");
				System.out.println("  Bye~ ");
				System.out.println("-------");
				break; //(!bool)�̴ϱ�, bool=true�� ����
			} else {
				System.out.println("������ �Է� ����");

			}

		}
	}
}