package org.java.conditoin;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		System.out.println("switch문");

		Scanner scn = new Scanner(System.in);
		System.out.println("주문을 해보세요(1~3까지, 정수)");

		int result = scn.nextInt();

		switch (result) {
		case 1:
			System.out.println("1번주문 물냉");
			break;
		case 2:
			System.out.println("2번주문 비냉");
			break;
		case 3:
			System.out.println("3번주문 막국수");
			break;
		default:
			System.out.println("왜 다른거 누르냐? 다시 눌러라.");
			
		}
	}
}

