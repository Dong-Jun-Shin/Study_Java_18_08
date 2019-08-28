package org.java.inheritance;

class A{
	public int num1;
	
	/*public A() {
		super(); -->Object클래스를 받음
	}*/ //생략되어 있는 기본 생성자
	
	public void aMethod() {
		System.out.println("슈퍼클래스");
	}
}

 //B가 A에게 받았다.
class B extends A{
	/*public B() {
		super();
	}*/ //생략되어 있는 기본 생성자
	public int num2;
}

class C extends A{
	/*public C() {
		super();
	}*/ //생략되어 있는 기본 생성자
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
