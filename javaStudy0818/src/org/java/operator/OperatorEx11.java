package org.java.operator;

public class OperatorEx11 {

	public static void main(String[] args) {
		System.out.println("논리연산자 ^");
		
		//서로 다른 논리값이면 true
		
		int num1=100;
		int num2=200;
		
		System.out.println(num1>=100 ^ num2>=200);
							// true ^ true
		System.out.println(num1>100 ^ num2>=200);
							// false ^ true		
		System.out.println(num1>=100 ^ num2>200);
							// true ^ false
		System.out.println(num1>100 ^ num2>200);
							// false ^ false
	}
}
