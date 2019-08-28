package org.java.loop;

public class WhileEx1 {

	public static void main(String[] args) {
		System.out.println("while");

		int num1 = 0;

		while (num1 < 10) {
			System.out.println(num1);
			num1++;
		}

		System.out.println();

		int num2 = 0;

		while (true) {
			System.out.println(num2);

			if (num2 > 9)
				break; // while¹® Á¾·á

			num2++;
		}
	}
}
