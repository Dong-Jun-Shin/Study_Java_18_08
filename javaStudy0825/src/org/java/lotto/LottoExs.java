package org.java.lotto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LottoExs {

	public static void main(String[] args) {
		System.out.println("0<= Math.random() <1");
		System.out.println("------------------------------");
		System.out.println("�̹��� �ζ� ��ȣ�� ��÷�ϰڽ��ϴ�.!!");
		System.out.println("-----------------");

		int[] result = new int[6];

		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + "��° ��ȣ�Դϴ�.!!");

			result[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) {
				if (result[i] == result[j]) {
					result[i] = (int) (Math.random() * 45 + 1);
				}
			}
			System.out.print((i + 1) + "��° ��ȣ�� ");
			System.out.println(result[i] + "!");
			System.out.println(result[i] + "�Դϴ�!");

			System.out.println("���� ��ȣ�Դϴ�.");
			System.out.println("---------------");

		}
		
		List<int[]> list = Arrays.asList(result);
		Collections.reverse(list);

		for (int i = 0; i < result.length; i++) {
			System.out.print(list + " ");

		}

		System.out.println();
		System.out.println("�����մϴ�!!");
	}
}
