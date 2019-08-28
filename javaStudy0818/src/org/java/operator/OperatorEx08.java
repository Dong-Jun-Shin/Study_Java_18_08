package org.java.operator;

public class OperatorEx08 {

	public static void main(String[] args) {

		System.out.println("논리 연산자");

		int num1 = 100;
		int num2 = 200;

		System.out.println(num1 >= 100);
		System.out.println(num2 >= 100);
		System.out.println(num1 >= 100 && num2 >= 200);
		System.out.println((num1 >= 100) + "&&" + (num2 >= 200));
		
		System.out.println();
		
		System.out.println(num1 > 100 && num2 >= 200);
							//false && true
		System.out.println(num1 >= 100 && num2 > 200);
							//true && false
		System.out.println(num1 > 100 && num2 > 200);
							//false && false
	}
}