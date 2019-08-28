package org.java.oop;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator cal1 = new Calculator();
		Scanner scn = new Scanner(System.in);

		boolean bool = false;

		System.out.println("첫번째 숫자를 입력하라.");
		cal1.setNum1(scn.nextInt());

		System.out.println("두번째 숫자를 입력하라.");
		cal1.setNum2(scn.nextInt());
		
		while (!bool) {
			System.out.println("연산기호를 입력하라. (end - 끝내기)");
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
				break; //(!bool)이니까, bool=true도 가능
			} else {
				System.out.println("연산자 입력 오류");

			}

		}
	}
}