package org.java.loop;

public class ArrayEx1 {

	public static void main(String[] args) {
		System.out.println("배열");

		/*
		 * 자바의 기본 자료형(primitive type) 1 2 4 8 정수형 byte short int long 실수형 float double
		 * 문자형 char 논리형 boolean
		 * 
		 * 참조형 : 배열, String, class, interface : ..new연산자를 이용해서 객체의 주소값을 저장. ..객체의 주소값으로
		 * 객체의 멤버를 접근(.)
		 * 
		 */

		// int형의 data를 저장할 수 있는 배열 arrInt를 선언했다.
		// int (data)5개를 저장할 수 있는 배열 객체 생성
		// new 주소값이 생성..
		// 배열 이름에는 배열의 주소값 저장
		// 1. 배열 선언
		int[] arrInt = new int[5];
		// 배열 초기화
		arrInt[0] = 10; // 배열의 인덱스는 0번지부터 시작
		arrInt[1] = 20;
		arrInt[2] = 30;
		arrInt[3] = 40;
		arrInt[4] = 50;

		System.out.println("배열의 길이: " + arrInt.length); // 배열의 길이
		System.out.println("arrInt[0]=" + arrInt[0]); // 0번지
		System.out.println("arrInt[1]=" + arrInt[1]);
		System.out.println("arrInt[2]=" + arrInt[2]);
		System.out.println("arrInt[3]=" + arrInt[3]);
		System.out.println("arrInt[4]=" + arrInt[4]);
		System.out.println();

		// 배열과 반복문(for)과 같이 사용

		int[] arrInt2 = new int[5];

		for (int i = 0; i < arrInt2.length; i++) {
			arrInt2[i] = 10 * i; //

		}

		for (int i = 0; i < arrInt2.length; i++) {

			System.out.println("arrInt[" + i + "]=" + arrInt[i]);

		}
	}
}
