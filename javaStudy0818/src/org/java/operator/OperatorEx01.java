package org.java.operator;

public class OperatorEx01 {

	public static void main(String[] args) {
		System.out.println("산술 연산자");
		
		int num1=100;
		int num2=50;
		
		System.out.println(num1+"+"+num2+"="+(num1+num2)); //100+50=150
		System.out.println(num1+"-"+num2+"="+(num1-num2)); //-
		System.out.println(num1+"*"+num2+"="+(num1*num2)); //*
		System.out.println(num1+"/"+num2+"="+((double)num1/num2)); 
							// (int + int), "/"는 double -> 변환해준다.
		System.out.println(num1+"%"+num2+"="+(num1%num2)); //나머지
		
	}
}
