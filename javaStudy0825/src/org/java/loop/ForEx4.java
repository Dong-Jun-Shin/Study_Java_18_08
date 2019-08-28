package org.java.loop;

public class ForEx4 {

	public static void main(String[] args) {
		int result = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
				result += i;// result = result + i
			}
		}
		System.out.println("1 ~ 100 Áß¿¡ Â¦¼öµéÀÇ ÃÑÇÕÀº " + result);
	}
}
