package org.java.interfaceEx;

public interface InterfaceEx1 {

	// public int num1; -> �������̽��̱� ������ ����
	public static final String INSTANCE = "PROJECT";

	// final ���(�� ���� �ʱ�ȭ)
	public abstract void excute(); // �߻�޼���

	default void method() {
		System.out.println("defalut �޼ҵ�");
	}

	public static void method2() {
		System.out.println("static �޼ҵ�");
	}

	void method3(); // public abstract- ����

	/*
	 * //�ν��Ͻ� ���� �Ұ� 
	 * public void method3() {
	 *  	System.out.println("�ν��Ͻ� �޼ҵ�"); 
	 * }
	 * 
	 */
}
