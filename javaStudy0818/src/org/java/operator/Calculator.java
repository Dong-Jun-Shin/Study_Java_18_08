package org.java.operator;

public class Calculator {
	
	private int num1;
	private int num2;
	
	public Calculator(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	public void add() {
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}
	
	public void sub() {
		System.out.println(num1+"-"+num2+"="+(num1-num2));
	}

	public void multi() {
		System.out.println(num1+"*"+num2+"="+(num1*num2));
	}

	public void div() {
		System.out.println(num1+"/"+num2+"="+((double)num1/num2));
	}


}
