package org.java.loop;

//import java.lang.*;  //자바의 기본패키지, 자동으로 import 되있음

public class RandomEx {

	public static void main(String[] args) {
		/* java.lang.(생략되있음) */
		System.out.println("Math.random()");
		// 난수 (무작위)..

		System.out.println("0~9까지 정수");
		System.out.println((int) (Math.random() * 10));
		// 0<=Math.random()<1
		// 형변환시 언제 형변환 시킬지 작성주의

		System.out.println("1~10까지 정수");
		System.out.println((int) (Math.random() * 10) + 1);

		for (int i = 0; i < 10; i++) {

			System.out.println("1~45까지 정수");
			System.out.println((int) (Math.random() * 45) + 1);
		}
	}
}
