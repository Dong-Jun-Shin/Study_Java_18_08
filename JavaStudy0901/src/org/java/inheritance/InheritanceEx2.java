package org.java.inheritance;

class Parent {
	public int num1;
	public int num2;
	
	public void method() {
		System.out.println("����Ŭ����");
	}
	
	public int method2(int num) {
		int sum=num+100;
		return sum;
	}
}

class Sub1 extends Parent{
	
	@Override
	public void method() {
		System.out.println("����Ŭ����(�������̵�)");
	}
}

class Sub2 extends Parent{
	
	@Override
	public void method() {
		// TODO Auto-generated method stub
		super.method(); // ����Ŭ���� �޼ҵ� ȣ��
	}
}


public class InheritanceEx2 {
	public static void main(String[] args) {
		
		Sub1 s1=new Sub1();
		s1.method();
		
		Sub2 s2=new Sub2();
		s2.method();
	}
}
