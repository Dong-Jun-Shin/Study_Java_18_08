package org.java.inheritance;

class A{
	public int num1;
	
	/*public A() {
		super(); -->ObjectŬ������ ����
	}*/ //�����Ǿ� �ִ� �⺻ ������
	
	public void aMethod() {
		System.out.println("����Ŭ����");
	}
}

 //B�� A���� �޾Ҵ�.
class B extends A{
	/*public B() {
		super();
	}*/ //�����Ǿ� �ִ� �⺻ ������
	public int num2;
}

class C extends A{
	/*public C() {
		super();
	}*/ //�����Ǿ� �ִ� �⺻ ������
	public int num3;
}

public class InheritanceEx1 {

	public static void main(String[] args) {
		
		B b=new B();
		b.num1=10;
		b.num2=20;
		b.aMethod();
		
		C c=new C();
		c.num1=10;
		c.num3=30;
		c.aMethod();
		
	}
}
