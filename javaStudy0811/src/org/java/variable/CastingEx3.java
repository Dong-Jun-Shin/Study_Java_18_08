package org.java.variable;

import java.util.Scanner;

public class CastingEx3 {

	public static void main(String[] args) {
		
		// ù��° ���� �� (65~90) �Է�

		System.out.println("�ҹ��ڷ� �ٲٰ� ���� �빮�ڸ� �Է����ּ���. (65~90)");

		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		char ch = (char) (a + 32);
		
		System.out.println("�Է� �빮��: " + (char) a);

		System.out.println("��� �ҹ���: " + ch);

		System.out.println("===========================");
		System.out.println();
		System.out.println();

		// �ι�° ���� �� (97~122) �Է�
		System.out.println("�빮�ڷ� �ٲٰ� ���� �ҹ��ڸ� �Է����ּ���. (97~122)");

		Scanner scn1 = new Scanner(System.in);

		int b = scn1.nextInt();

		System.out.println("�Է� �ҹ���: " + (char) b);

		char ch1 = (char) (b - 32);

		System.out.println("��� �빮��: " + ch1);

		System.out.println("===========================");
	}
}
