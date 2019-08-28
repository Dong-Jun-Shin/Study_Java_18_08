package org.java.operator;

public class OperatorEx13 {

	public static void main(String[] args) {
		System.out.println("단항 연산자");

		int num1 = 10;

		System.out.println(num1++); // 선처리 후증가
		System.out.println(num1);
		System.out.println();

		int num2 = 10;

		System.out.println(++num2); // 선증가 후처리
		System.out.println(num2);
		System.out.println();

		int num3 = 10;

		System.out.println(num3--); // 선처리 후감소
		System.out.println(num3);
		System.out.println();

		int num4 = 10;

		System.out.println(--num4); // 선감소 후처리
		System.out.println(num4);
		System.out.println();
	}
}
