package org.java.loop;

public class ArrayEx3 {

	public static void main(String[] args) {
		System.out.println("배열");

		char[] ch = { 'a', 'b', 'c', 'd', 'e' };

		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		System.out.println();
		// foreach, 객체, 배열의 반복문
		// jsp >> JSTL foreach
		for (char cData : ch) {
			System.out.print(cData + " ");
		}
		System.out.println();

		int[] arrInt = { 10, 20, 30, 40, 50 };
		
		for (int i = 0; i < ch.length; i++) {
			System.out.print(arrInt[i] + " ");
		}
		System.out.println();
		
		for (int iData : arrInt) {
			System.out.print(iData + " ");
		}
		/*
		 * 타입 :
		 * 
		 * for(타입 변수:배열이름){ 변수; 자동으로 배열의 0번지부터 실행 }
		 */
	}
}
