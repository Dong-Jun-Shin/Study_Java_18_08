package org.java.abstract1;

import org.java.abstract1.AbstractEx1Sub;

public class AbstractEx1Main {

	public static void main(String[] args) {
		
		//�߻�Ŭ������ ��ü�� �������� ���Ѵ�.
		//AbstractEx1 a1=new AbstractEx1(); -> ����
		//AbstractEx1Sub a2 = new AbstractEx1Sub(); -> ����
		
		//������(polymorphism)
		AbstractEx1 a1=new AbstractEx1SubSub();
		a1.num1=10;
		a1.method();
		a1.method2();
		
		AbstractEx1Sub a2=new AbstractEx1SubSub();
		a2.num1=10;
		a2.method();
		a2.method2();
		a2.method3();
		
		AbstractEx1SubSub a3 = new AbstractEx1SubSub();
		a3.num1=10;
		a3.num2=20;
		a3.method();
		a3.method2();
		a3.method3();
	}
}
