package org.java.construct;

public class ConstructEx1Main {

	public static void main(String[] args) {

		// 오버로딩 메소드 (같은 이름에 다른 타입들로 구성)
		System.out.println("문자열");
		System.out.println('a');
		System.out.println(11);
		System.out.println(Math.random());

		System.out.println("=================================");
		//둘 다 호출, this로 호출을 해서.
		ConstructEx1 c1 = new ConstructEx1();
		System.out.println("===================");
		ConstructEx1 c2 = new ConstructEx1("다른 생성자2");
	}
}
