package org.java.variable;

import java.util.Scanner;

public class NE {

	public static void main(String[] args) {
		System.out.println("원의 넓이를 원하는 갯수만큼 구하는 프로그램입니다.");

		System.out.println("구하고자 하는 원은 몇개입니까?");

		Scanner scn = new Scanner(System.in);
		int Num = scn.nextInt(); // 정수값만 받는다.

		int[] radi = new int[Num];
		double[] area = new double[Num];
		final double PI = 3.14;

		for (int i = 0; i < Num; i++) {
			int j = i + 1;
			System.out.println("구하고자 하는 " + j + "번째 원의 지름을 입력해주세요.");

			Scanner scn1 = new Scanner(System.in);

			radi[i] = scn1.nextInt();

			area[i] = PI * radi[i] * radi[i];

			System.out.println(j + "번째 원의 넓이는 " + area[i] + " 입니다.");
		}
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("구하시는 원의 지름은 순서대로 ");

		for (int k = 0; k < Num; k++) {
			int o = k + 1;
			System.out.println(o + "번째 원의 " + "지름 : " + radi[k] + "  원의 넓이 : " + area[k]);

		}
	}
}
