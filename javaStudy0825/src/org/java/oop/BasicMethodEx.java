package org.java.oop;

public class BasicMethodEx {
  //���
	
	private String userId;
	private String userPw;
	
	public static void staticMethod() {
		System.out.println("staticMethod");
	}
	
	
	public void method1() {
		System.out.println("�ż���1");
		return;//��ȯ���� ���� �� ��������
	}
						//�������� : �Ű����� or �żҵ� �� ����(�ݵ�� �ʱ�ȭ �ؾ� ��)
	public void method2(String userName) {
		System.out.println(userName);
		return;//��ȯ���� ���� �� ��������
	}
	
	public int method3() {
		System.out.println("�ż���1");
		return 0;// int�� ��ȯ�ؾ� �ؼ� ��ȯ���� �ʿ�		
	}
	                       //�Ű����� >> ��������ȭ�ϱ�
	public int method4(int num1, int num2) {
		//��������
		int sum=num1+num2;
		
		return sum;
	}
}


