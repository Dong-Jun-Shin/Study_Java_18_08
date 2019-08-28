package org.java.operator;

import java.util.Scanner;

public class OperatorEx02 {

	public static void main(String[] args) {
		// int형 아래(byte+char+short) 연산시 자동으로 int
		System.out.println("char형 연산시 주의할 점");
		
		//0811.variable.CastingEX 참조
		char ch='a';
		
		System.out.println(ch);
		System.out.println((int)ch);
		
		int sum1='A'+'a'; //int형 아래 연산 시 자동으로 int
		
		System.out.println(sum1);
		System.out.println('b'-'a');
		
		System.out.println('a'-'A');
		
		//대문자(60~) -> 소문자 (90~)
		
		System.out.println((char)('b'-32));
		
		System.out.println((char)('B'+32));


		
		
	}
}



