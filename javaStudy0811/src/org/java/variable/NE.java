package org.java.variable;

import java.util.Scanner;

public class NE {

	public static void main(String[] args) {
		System.out.println("���� ���̸� ���ϴ� ������ŭ ���ϴ� ���α׷��Դϴ�.");

		System.out.println("���ϰ��� �ϴ� ���� ��Դϱ�?");

		Scanner scn = new Scanner(System.in);
		int Num = scn.nextInt(); // �������� �޴´�.

		int[] radi = new int[Num];
		double[] area = new double[Num];
		final double PI = 3.14;

		for (int i = 0; i < Num; i++) {
			int j = i + 1;
			System.out.println("���ϰ��� �ϴ� " + j + "��° ���� ������ �Է����ּ���.");

			Scanner scn1 = new Scanner(System.in);

			radi[i] = scn1.nextInt();

			area[i] = PI * radi[i] * radi[i];

			System.out.println(j + "��° ���� ���̴� " + area[i] + " �Դϴ�.");
		}
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("���Ͻô� ���� ������ ������� ");

		for (int k = 0; k < Num; k++) {
			int o = k + 1;
			System.out.println(o + "��° ���� " + "���� : " + radi[k] + "  ���� ���� : " + area[k]);

		}
	}
}
