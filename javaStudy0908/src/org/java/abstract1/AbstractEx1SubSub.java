package org.java.abstract1;

public class AbstractEx1SubSub extends AbstractEx1Sub {
	public int num2;
	
	@Override
	public void method3() {
		System.out.println("추상메소드 method3");
	}
	
	@Override
	public void method2() {
		System.out.println("추상메소드 method2");
	}
} 
