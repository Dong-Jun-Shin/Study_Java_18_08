package org.java.operator;

import java.util.Scanner;

public class CalculatorEx {

	public static void main(String[] args) {

		int num = 10;
		char ch = 'a';

		Scanner scn = new Scanner(System.in); // �ֿܼ� �Է�
		
		System.out.println("ù��° ����(����)");
		int num1=scn.nextInt(); //������ data�� �Է�
		
		System.out.println("�ι�° ����(����)");
		int num2=scn.nextInt(); //������ data�� �Է�
		
		
		Calculator cal1 = new Calculator(num1, num2);

		cal1.add();
		cal1.sub();
		cal1.multi();
		cal1.div();


	}
}
