package org.java.construct;

public class ConstructEx1 {

	public int num1;
	public int num2;

	public ConstructEx1() {
		this("호출한 생성자");
		System.out.println("기본생성자");
	}

	public ConstructEx1(String name) {
		System.out.println(name + "오버로딩 생성자");
	}

	/*
	 * public ConstructEx1() { System.out.println("기본생성자"); // TODO Auto-generated
	 * constructor stub }
	 */ // 기본생성자, 클래스명과 메서드 명이 동일.

	public void method() {
		System.out.println("메소드1");
	}

	// 메소드 오버로딩
	public void method(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	/*
	 * (안됨) public void method(int num2, int num1) { System.out.println(num1+num2);
	 * }
	 */
	public void method(int num1, String name) {
		System.out.println("오버로딩");
	}

	// 타입이 바뀌면 자리바꿈도 가능
	public void method(String name, int num1) {
		System.out.println("오버로딩");
	}

}
