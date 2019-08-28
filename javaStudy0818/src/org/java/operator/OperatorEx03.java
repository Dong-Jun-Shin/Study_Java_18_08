package org.java.operator;

import java.util.Scanner;

public class OperatorEx03 {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		
		System.out.println("첫번째 정수 입력");
		int num1=scn.nextInt();
		
		System.out.println("첫번째 정수 입력");
		int num2=scn.nextInt();
		
		System.out.println("비교연산자");
		
		System.out.println(num1>num2); // 초과
		System.out.println(num1>=num2); // 이상
		System.out.println(num1<num2); // 미만
		System.out.println(num1<=num2); // 이하
		System.out.println(num1==num2); // 동일값?
		System.out.println(num1!=num2); // 다른값?
		
	}
}
