package org.java.operator;

import java.util.Scanner;

public class CalculatorEx {

	public static void main(String[] args) {

		int num = 10;
		char ch = 'a';

		Scanner scn = new Scanner(System.in); // 콘솔에 입력
		
		System.out.println("첫번째 숫자(정수)");
		int num1=scn.nextInt(); //정수형 data를 입력
		
		System.out.println("두번째 숫자(정수)");
		int num2=scn.nextInt(); //정수형 data를 입력
		
		
		Calculator cal1 = new Calculator(num1, num2);

		cal1.add();
		cal1.sub();
		cal1.multi();
		cal1.div();


	}
}
