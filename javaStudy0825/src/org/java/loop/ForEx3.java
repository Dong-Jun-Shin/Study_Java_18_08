package org.java.loop;

public class ForEx3 {

	public static void main(String[] args) {

		for (int i = 0; i < 11; i = i + 2) {
			System.out.print(i + " ");
		}
		System.out.println();
//---------------------------------------------------
		for (int i = 0; i < 11; i += 2) {
			System.out.print(i + "  ");
		}
		System.out.println();
//---------------------------------------------------
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
//---------------------------------------------------
	}
}
