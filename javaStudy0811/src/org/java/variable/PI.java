package org.java.variable;

import java.util.Scanner;

public class PI {

	public static void main(String[] args) {
		System.out.println("final��� �̿��� ���� �����Դϴ�.");
		System.out.println();
		//radius*radius*PI
		//final ����� �̿��ؼ� 3.14�� PI�� ����
		final double PI = 3.14;
		
		System.out.println("���ϰ� ���� ������ �������� �Է����ּ���.");
		
		Scanner scn=new Scanner(System.in);
		
		int r = scn.nextInt();
		
		double circle= PI * r * r;
		
		System.out.println("���ϴ� ���� ���̴� "+circle+" �Դϴ�.");
	}
}
