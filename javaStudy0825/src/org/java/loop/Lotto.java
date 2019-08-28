package org.java.loop;

public class Lotto {

	public static void main(String[] args) {
		System.out.println("로또");

		int[] lotto = new int[45];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}

		int temp;

		for (int i = 0; i < 1000; i++) {

			int idx = (int) (Math.random() * 45);

			temp = lotto[idx]; // 임의의 lotto번지의 숫자를 빈공간 저장
			lotto[idx] = lotto[0]; // lotto 0번지 숫자를 임의의 lotto번지에 저장
			lotto[0] = temp; // 빈공간의 숫자를 lotto 0번지에 저장

		}
		
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		
	}
}
