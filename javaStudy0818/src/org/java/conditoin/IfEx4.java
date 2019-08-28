package org.java.conditoin;

import java.util.Scanner;

public class IfEx4 {

	public static void main(String[] args) {
		System.out.println("조건이 2개 이상");

		// +입력 -> +연산
		// -입력 -> -연산
		// *입력 -> *연산
		// /입력 -> /연산

		Scanner scn = new Scanner(System.in);

		while (true) {

			System.out.println("첫번째 숫자(정수) 입력");
			int num1 = scn.nextInt();

			System.out.println("두번째 숫자(정수) 입력");
			int num2 = scn.nextInt();

			System.out.println("연산자를 입력(+, -, *, /)");
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
				System.err.println("연산 기호 입력 오류");
				System.out.println();
				System.out.println();
			}
		}
	}
}