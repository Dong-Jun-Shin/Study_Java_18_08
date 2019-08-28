package org.java.loop;

public class ArrayEx2 {

	public static void main(String[] args) {
		System.out.println("배열");

		// 배열의 선언 방법
		int[] arrInt = new int[5];
		int[] arrInt2 = new int[] { 10, 20, 30, 40, 50 };
		int[] arrInt3 = { 10, 20, 30, 40, 50 };

		char[] ch = new char[5];
		char[] ch2 = { 'a', 'b', 'c', 'd', 'e' }; // char형 배열
		String[] str = { "m", "a", "a", "s", "o" };// String형 배열

		String strCh = new String(ch); // char배열을 String(문자열) 변환
		System.out.println(strCh);
	}
}