package org.java.operator;

import java.util.Scanner;

public class OperatorEx03 {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է�");
		int num1=scn.nextInt();
		
		System.out.println("ù��° ���� �Է�");
		int num2=scn.nextInt();
		
		System.out.println("�񱳿�����");
		
		System.out.println(num1>num2); // �ʰ�
		System.out.println(num1>=num2); // �̻�
		System.out.println(num1<num2); // �̸�
		System.out.println(num1<=num2); // ����
		System.out.println(num1==num2); // ���ϰ�?
		System.out.println(num1!=num2); // �ٸ���?
		
	}
}
