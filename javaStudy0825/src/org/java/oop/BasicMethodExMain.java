package org.java.oop;

import java.util.Scanner;

public class BasicMethodExMain {

	public static void main(String[] args) {
		
		BasicMethodEx.staticMethod();
		
		BasicMethodEx c1 = new BasicMethodEx();

		c1.method1();// �ż��� ȣ��
		c1.method2("name1");
		System.out.println(c1.method3()); // �ż����� ��ȯ���� ȣ���� �� ����(��)���� ��ȯ�ȴ�.

		int result = c1.method4(100, 200);
		System.out.println(result);
		System.out.println(c1.method4(100, 200));
		
		BasicMethodEx c2= new BasicMethodEx();
		
		System.out.println("�� ���� ���� ���Ͽ���");
		Scanner scn=new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է�: ");
		int num1=scn.nextInt();
		
		System.out.println("�ι�° ���� �Է�: ");
		int num2=scn.nextInt();
		
		int result2 = c2.method4(num1, num2);
		System.out.println(num1+" + "+num2+" = "+result2);
	}
}

