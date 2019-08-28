package org.java.operator;

public class OperatorEx1 {
	public static void main(String[] args) {
		System.out.println("산술연산자 +-*/%");
		
		int num1=100;
		int num2=200;

		System.out.println(num1+"+"+num2+"="+(num1+num2)); // 100 + 200= 300
		System.out.println(num1+"-"+num2+"="+(num1-num2)); // 100 - 200=-100
		System.out.println(num1+"*"+num2+"="+(num1*num2)); // 100 * 200=20000
		System.out.println(num1+"/"+num2+"="+(num1/num2)); // 100 / 200= 0
		System.out.println(num1+"%"+num2+"="+(num1%num2)); // 100 % 200= 100
		
		
		// int/int >> int, double/int >> double/double >> 
	}
}
