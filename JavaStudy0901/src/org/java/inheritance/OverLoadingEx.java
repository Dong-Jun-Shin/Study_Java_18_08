package org.java.inheritance;

public class OverLoadingEx {

	public OverLoadingEx() {
		System.out.println("�⺻������");
	}
	
	public OverLoadingEx(String name) {
		System.out.println("������ �����ε�");
		System.out.println(name);
	}
	
	
	
	public void overLoadingMethod() {
		System.out.println("�⺻ �޼ҵ�");
	}

	public void overloadingMethod(int num1, String name) {
		
		System.out.println(name+num1);
	}
	
	public void overloadingMethod(String name, int num1) {
		
		System.out.println(name+num1);
	}
}
