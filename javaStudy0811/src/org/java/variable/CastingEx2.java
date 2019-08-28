package org.java.variable;

import java.util.Scanner;

public class CastingEx2 {

	public static void main(String[] args) {
		System.out.println("아스키 코드");

		System.out.println('A' + 1);
		System.out.println('a');
		System.out.println((int) 'a'); // 강제 형변환
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

		// 첫번째 정수 값 (65~90) 입력

		System.out.println("소문자로 바꾸고 싶은 대문자를 입력해주세요.");

		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		char ch = (char) (a + 32);
		System.out.println(ch);
	}
}
