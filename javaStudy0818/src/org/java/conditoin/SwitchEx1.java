package org.java.conditoin;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		System.out.println("switch��");

		Scanner scn = new Scanner(System.in);
		System.out.println("�ֹ��� �غ�����(1~3����, ����)");

		int result = scn.nextInt();

		switch (result) {
		case 1:
			System.out.println("1���ֹ� ����");
			break;
		case 2:
			System.out.println("2���ֹ� ���");
			break;
		case 3:
			System.out.println("3���ֹ� ������");
			break;
		default:
			System.out.println("�� �ٸ��� ������? �ٽ� ������.");
			
		}
	}
}

