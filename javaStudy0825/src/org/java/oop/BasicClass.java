package org.java.oop;

public class BasicClass {
	//���

	//���(�ʵ�)
	private String userId; //(�ʵ�)�ν��Ͻ� ���
	public int userAge;   //(�ʵ�)�ν��Ͻ� ��� (��ü�� ���� �� �� ����)
	
	public static String projectName; //Ŭ���� ��� (=static ���(��ü�� ���� ���ص� ��))

	//�ν��Ͻ� ���- ��ü�� ����, �Ҹ꿡 ���� ����, ����
	//Ŭ���� ���- Ŭ������ ����, �Ҹ꿡 ���� ����, ����
	
	
	
	public static void staticMethed() {
		System.out.println("static �ż���");
	}
	
	//���(�ż���) �ν��Ͻ� ���(��ü�� ������ �� ����)
	public void method1() {
		System.out.println("�ż���1");
	}

	public void method2(String name) {
		System.out.println("�ż���2");
		System.out.println(name);
	}

	public int method3(int num1, int num2) {

		System.out.println("�ż���3");
		return num1 + num2;
	}
}
