package org.java.operator;

import java.util.Scanner;

public class OperatorEx02 {

	public static void main(String[] args) {
		// int�� �Ʒ�(byte+char+short) ����� �ڵ����� int
		System.out.println("char�� ����� ������ ��");
		
		//0811.variable.CastingEX ����
		char ch='a';
		
		System.out.println(ch);
		System.out.println((int)ch);
		
		int sum1='A'+'a'; //int�� �Ʒ� ���� �� �ڵ����� int
		
		System.out.println(sum1);
		System.out.println('b'-'a');
		
		System.out.println('a'-'A');
		
		//�빮��(60~) -> �ҹ��� (90~)
		
		System.out.println((char)('b'-32));
		
		System.out.println((char)('B'+32));


		
		
	}
}



