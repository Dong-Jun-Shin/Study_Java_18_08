package org.java.conditoin;

public class Calculator {

	//�ʵ� (�ɹ�)
	private int num1;
	private int num2;

	//������
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	//�޼���
	public void add() {
		System.out.println("add() �޼���");
		System.err.println("����: " + num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println();
	}

	public void sub() {
		System.out.println("sub() �޼���");
		System.err.println("����: " + num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println();
	}

	public void multi() {
		System.out.println("multi() �޼���");
		System.err.println("���ϱ�: " + num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println();
	}

	public void div() {
		System.out.println("div() �޼���");
		System.err.println("������: " + num1 + " / " + num2 + " = " + (num1 / num2));
		System.out.println();
	}
}
