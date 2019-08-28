package org.java.loop;

public class ForEx2 {

	public static void main(String[] args) {
		System.out.println("for");
		// 2 ~ 9까지 정의
		for (int i = 2; i < 10; i++) {

			System.out.println(i+"단입니다.");
			for (int j = 1; j < 10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
				
			}
		}
		
		for (int i = 10; i > 1; i--) {

			System.out.println(i+"단입니다.");
			for (int j = 9; j > 0; j--) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}
}