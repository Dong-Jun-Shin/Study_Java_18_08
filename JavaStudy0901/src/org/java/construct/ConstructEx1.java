package org.java.construct;

public class ConstructEx1 {

	public int num1;
	public int num2;

	public ConstructEx1() {
		this("ȣ���� ������");
		System.out.println("�⺻������");
	}

	public ConstructEx1(String name) {
		System.out.println(name + "�����ε� ������");
	}

	/*
	 * public ConstructEx1() { System.out.println("�⺻������"); // TODO Auto-generated
	 * constructor stub }
	 */ // �⺻������, Ŭ������� �޼��� ���� ����.

	public void method() {
		System.out.println("�޼ҵ�1");
	}

	// �޼ҵ� �����ε�
	public void method(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	/*
	 * (�ȵ�) public void method(int num2, int num1) { System.out.println(num1+num2);
	 * }
	 */
	public void method(int num1, String name) {
		System.out.println("�����ε�");
	}

	// Ÿ���� �ٲ�� �ڸ��ٲ޵� ����
	public void method(String name, int num1) {
		System.out.println("�����ε�");
	}

}
