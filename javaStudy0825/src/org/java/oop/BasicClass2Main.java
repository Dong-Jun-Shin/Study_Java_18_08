package org.java.oop;

import org.java.oopsub.BasicClass2;

public class BasicClass2Main {

	public static void main(String[] args) {

		System.out.println("������Ʈ��: "+BasicClass2.PROJECTNAME);
		
		BasicClass2 c1 = new BasicClass2();
		// Ŭ���� �ν��Ͻ�ȭ

		c1.userAge = 10; // ��� Ŭ������ object Ŭ������ ����� �޴´�.
		                 //   ->��𼭵� object�� �ż��� ��� ����
		c1.method5();
		
		System.out.println("����: "+c1.userAge);
	}
}
