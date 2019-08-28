package org.java.oop;

import java.util.Scanner;

public class BasicMethodExMain {

	public static void main(String[] args) {
		
		BasicMethodEx.staticMethod();
		
		BasicMethodEx c1 = new BasicMethodEx();

		c1.method1();// 매서드 호출
		c1.method2("name1");
		System.out.println(c1.method3()); // 매서드의 반환값은 호출한 그 시점(곳)에서 반환된다.

		int result = c1.method4(100, 200);
		System.out.println(result);
		System.out.println(c1.method4(100, 200));
		
		BasicMethodEx c2= new BasicMethodEx();
		
		System.out.println("두 수의 합을 구하여라");
		Scanner scn=new Scanner(System.in);
		
		System.out.println("첫번째 정수 입력: ");
		int num1=scn.nextInt();
		
		System.out.println("두번째 정수 입력: ");
		int num2=scn.nextInt();
		
		int result2 = c2.method4(num1, num2);
		System.out.println(num1+" + "+num2+" = "+result2);
	}
}

