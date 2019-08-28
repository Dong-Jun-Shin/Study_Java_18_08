package org.java.variable;

import java.util.Scanner;

public class CastingEx3 {

	public static void main(String[] args) {
		
		// 첫번째 정수 값 (65~90) 입력

		System.out.println("소문자로 바꾸고 싶은 대문자를 입력해주세요. (65~90)");

		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		char ch = (char) (a + 32);
		
		System.out.println("입력 대문자: " + (char) a);

		System.out.println("출력 소문자: " + ch);

		System.out.println("===========================");
		System.out.println();
		System.out.println();

		// 두번째 정수 값 (97~122) 입력
		System.out.println("대문자로 바꾸고 싶은 소문자를 입력해주세요. (97~122)");

		Scanner scn1 = new Scanner(System.in);

		int b = scn1.nextInt();

		System.out.println("입력 소문자: " + (char) b);

		char ch1 = (char) (b - 32);

		System.out.println("출력 대문자: " + ch1);

		System.out.println("===========================");
	}
}
