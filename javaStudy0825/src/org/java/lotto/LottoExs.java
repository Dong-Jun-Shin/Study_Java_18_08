package org.java.lotto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LottoExs {

	public static void main(String[] args) {
		System.out.println("0<= Math.random() <1");
		System.out.println("------------------------------");
		System.out.println("이번주 로또 번호를 추첨하겠습니다.!!");
		System.out.println("-----------------");

		int[] result = new int[6];

		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + "번째 번호입니다.!!");

			result[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) {
				if (result[i] == result[j]) {
					result[i] = (int) (Math.random() * 45 + 1);
				}
			}
			System.out.print((i + 1) + "번째 번호는 ");
			System.out.println(result[i] + "!");
			System.out.println(result[i] + "입니다!");

			System.out.println("다음 번호입니다.");
			System.out.println("---------------");

		}
		
		List<int[]> list = Arrays.asList(result);
		Collections.reverse(list);

		for (int i = 0; i < result.length; i++) {
			System.out.print(list + " ");

		}

		System.out.println();
		System.out.println("축하합니다!!");
	}
}
