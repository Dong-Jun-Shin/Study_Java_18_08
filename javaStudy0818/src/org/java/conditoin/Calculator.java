package org.java.conditoin;

public class Calculator {

	//필드 (맴버)
	private int num1;
	private int num2;

	//생성자
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	//메서드
	public void add() {
		System.out.println("add() 메서드");
		System.err.println("덧셈: " + num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println();
	}

	public void sub() {
		System.out.println("sub() 메서드");
		System.err.println("빼기: " + num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println();
	}

	public void multi() {
		System.out.println("multi() 메서드");
		System.err.println("곱하기: " + num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println();
	}

	public void div() {
		System.out.println("div() 메서드");
		System.err.println("나누기: " + num1 + " / " + num2 + " = " + (num1 / num2));
		System.out.println();
	}
}
