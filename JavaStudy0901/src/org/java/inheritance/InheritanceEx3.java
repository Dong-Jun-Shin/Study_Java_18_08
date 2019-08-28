package org.java.inheritance;

class SuperClass{
	public void superMethod() {
		System.out.println("슢어클래스");
	}
}

class SubClass1 extends SuperClass{
	
	@Override
	public void superMethod() {
		System.out.println("오버라이딩 메소드");
	}
}

class SubClass2 extends SuperClass{
	@Override
	public void superMethod() {
		System.out.println("옵어라이딩 멧오드");
	}
}

public class InheritanceEx3 {
	
	public static void main(String[] args) {
		
		SubClass1 s1=new SubClass1();
		s1.superMethod();
		
		SubClass2 s2=new SubClass2();
		s2.superMethod();
	}
}
