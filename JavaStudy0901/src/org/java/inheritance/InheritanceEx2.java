package org.java.inheritance;

class Parent {
	public int num1;
	public int num2;
	
	public void method() {
		System.out.println("슈퍼클래스");
	}
	
	public int method2(int num) {
		int sum=num+100;
		return sum;
	}
}

class Sub1 extends Parent{
	
	@Override
	public void method() {
		System.out.println("서브클래스(오버라이딩)");
	}
}

class Sub2 extends Parent{
	
	@Override
	public void method() {
		// TODO Auto-generated method stub
		super.method(); // 슈퍼클래스 메소드 호출
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
