package org.java.inheritance;

public class OverLoadingEx {

	public OverLoadingEx() {
		System.out.println("기본생성자");
	}
	
	public OverLoadingEx(String name) {
		System.out.println("생성자 오버로딩");
		System.out.println(name);
	}
	
	
	
	public void overLoadingMethod() {
		System.out.println("기본 메소드");
	}

	public void overloadingMethod(int num1, String name) {
		
		System.out.println(name+num1);
	}
	
	public void overloadingMethod(String name, int num1) {
		
		System.out.println(name+num1);
	}
}
