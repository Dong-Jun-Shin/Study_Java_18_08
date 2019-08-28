package org.java.conditoin;

import java.util.Scanner;

public class IfEx03 {

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

			if (op.equals("+")) {
				System.err.println("덧셈: " + num1 + " + " + num2 + " = " + (num1 + num2));
			} else if (op.equals("-")) {
				System.err.println("빼기: " + num1 + " - " + num2 + " = " + (num1 - num2));
			} else if (op.equals("*")) {
				System.err.println("곱하기: " + num1 + " * " + num2 + " = " + (num1 * num2));
			} else if (op.equals("/")) {
				System.err.println("나누기: " + num1 + " / " + num2 + " = " + (num1 / num2));
			} else {
				System.err.println("연산 기호 입력 오류");
				System.out.println();
				System.out.println();
			}

		}
	}
}
