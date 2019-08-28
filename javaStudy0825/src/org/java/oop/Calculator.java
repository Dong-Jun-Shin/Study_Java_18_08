package org.java.oop;

public class Calculator {

	private int num1;
	private int num2;
	private String M;
	
	public void setNum1(int num1) {
		this.num1=num1;
	}
	
	public void setNum2(int num2) {
		this.num2=num2;
	}
	
	
	public void add() {
		System.out.println(num1+num2);
		System.out.println("-------------");
	}
	
	public void sub() {
		System.out.println(num1-num2);
		System.out.println("-------------");
	}
	
	public void multi() {
		System.out.println(num1*num2);
		System.out.println("-------------");
	}
	
	public void div() {
		System.out.println(num1/num2);
		System.out.println("-------------");
	}
}
