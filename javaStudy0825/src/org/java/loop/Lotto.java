package org.java.loop;

public class Lotto {

	public static void main(String[] args) {
		System.out.println("�ζ�");

		int[] lotto = new int[45];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}

		int temp;

		for (int i = 0; i < 1000; i++) {

			int idx = (int) (Math.random() * 45);

			temp = lotto[idx]; // ������ lotto������ ���ڸ� ����� ����
			lotto[idx] = lotto[0]; // lotto 0���� ���ڸ� ������ lotto������ ����
			lotto[0] = temp; // ������� ���ڸ� lotto 0������ ����

		}
		
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		
	}
}
