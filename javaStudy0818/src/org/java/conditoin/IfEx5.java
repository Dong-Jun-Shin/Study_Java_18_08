package org.java.conditoin;

import java.util.Scanner;

public class IfEx5 {

	public static void main(String[] args) {
		System.out.println("if문 실습");

		while (true) {
			System.out.println("점수를 입력하세요.(정수)");

			Scanner scn = new Scanner(System.in);

			int grade = scn.nextInt();

			if (grade >= 90) {
				if (grade >= 95) {
					System.out.println("당신의 학점은 A+ 입니다.");
				} else {
					System.out.println("당신의 학점은 A 입니다.");
				}
			} else if (grade >= 80) {
				if (grade >= 85) {
					System.out.println("당신의 학점은 B+ 입니다.");
				} else {
					System.out.println("당신의 학점은 B 입니다.");
				}
			} else if (grade >= 70) {
				if (grade >= 75) {
					System.out.println("당신의 학점은 C+ 입니다.");
				} else {
					System.out.println("당신의 학점은 C 입니다.");
				}
			} else if (grade >= 60) {
				if (grade >= 65) {
					System.out.println("당신의 학점은 D+ 입니다.");
				} else {
					System.out.println("당신의 학점은 D 입니다.");
				}
			} else {
				System.out.println("당신의 학점은 F 입니다.");
			}
		}
	}
}
