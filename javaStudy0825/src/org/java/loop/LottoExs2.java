package org.java.loop;

public class LottoExs2 {

	public static void main(String[] args) {
		int[] arrInt = new int[45];

		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i + 1;
			System.out.println(arrInt[i] + " ");
		}

	/*
	 * for (int i = 0; i < arrInt.length; i++) { 
	 * 		for (int j= 1; j < arrInt.length+1; j++) { 
	 * 			arrInt[i] = i+1; 
	 * 			System.out.println(arrInt[i]+ " "); 
	 * 		}
	 * }
	 */

		for (int i = 0; i < 1000; i++) {

			int RanNum1;

			int r = (int) (Math.random() * 45);

			RanNum1 = arrInt[r];
			arrInt[r] = arrInt[0];
			arrInt[0] = RanNum1;

		}

		for (int i = 0; i < arrInt.length; i++) {
			System.out.print(arrInt[i] + " ");
		}
	}
}
