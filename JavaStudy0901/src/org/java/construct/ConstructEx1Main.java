package org.java.construct;

public class ConstructEx1Main {

	public static void main(String[] args) {

		// �����ε� �޼ҵ� (���� �̸��� �ٸ� Ÿ�Ե�� ����)
		System.out.println("���ڿ�");
		System.out.println('a');
		System.out.println(11);
		System.out.println(Math.random());

		System.out.println("=================================");
		//�� �� ȣ��, this�� ȣ���� �ؼ�.
		ConstructEx1 c1 = new ConstructEx1();
		System.out.println("===================");
		ConstructEx1 c2 = new ConstructEx1("�ٸ� ������2");
	}
}
