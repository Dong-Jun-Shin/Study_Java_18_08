package org.java.variable;

import java.util.Scanner;

public class CastingEx2 {

	public static void main(String[] args) {
		System.out.println("�ƽ�Ű �ڵ�");

		System.out.println('A' + 1);
		System.out.println('a');
		System.out.println((int) 'a'); // ���� ����ȯ
		System.out.println();
		System.out.println('a' + 'A');
		System.out.println('a' - 'A');
		System.out.println('b' + 'B');
		System.out.println();

		System.out.println(97);
		System.out.println((char) 97);
		System.out.println(97 - 32);
		System.out.println((char) 65);
		System.out.println((int) 'Z');

		// ù��° ���� �� (65~90) �Է�

		System.out.println("�ҹ��ڷ� �ٲٰ� ���� �빮�ڸ� �Է����ּ���.");

		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		char ch = (char) (a + 32);
		System.out.println(ch);
	}
}
