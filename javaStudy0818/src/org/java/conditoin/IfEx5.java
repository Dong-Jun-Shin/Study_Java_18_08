package org.java.conditoin;

import java.util.Scanner;

public class IfEx5 {

	public static void main(String[] args) {
		System.out.println("if�� �ǽ�");

		while (true) {
			System.out.println("������ �Է��ϼ���.(����)");

			Scanner scn = new Scanner(System.in);

			int grade = scn.nextInt();

			if (grade >= 90) {
				if (grade >= 95) {
					System.out.println("����� ������ A+ �Դϴ�.");
				} else {
					System.out.println("����� ������ A �Դϴ�.");
				}
			} else if (grade >= 80) {
				if (grade >= 85) {
					System.out.println("����� ������ B+ �Դϴ�.");
				} else {
					System.out.println("����� ������ B �Դϴ�.");
				}
			} else if (grade >= 70) {
				if (grade >= 75) {
					System.out.println("����� ������ C+ �Դϴ�.");
				} else {
					System.out.println("����� ������ C �Դϴ�.");
				}
			} else if (grade >= 60) {
				if (grade >= 65) {
					System.out.println("����� ������ D+ �Դϴ�.");
				} else {
					System.out.println("����� ������ D �Դϴ�.");
				}
			} else {
				System.out.println("����� ������ F �Դϴ�.");
			}
		}
	}
}
