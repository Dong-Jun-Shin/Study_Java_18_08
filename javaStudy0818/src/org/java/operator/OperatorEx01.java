package org.java.operator;

public class OperatorEx01 {

	public static void main(String[] args) {
		System.out.println("��� ������");
		
		int num1=100;
		int num2=50;
		
		System.out.println(num1+"+"+num2+"="+(num1+num2)); //100+50=150
		System.out.println(num1+"-"+num2+"="+(num1-num2)); //-
		System.out.println(num1+"*"+num2+"="+(num1*num2)); //*
		System.out.println(num1+"/"+num2+"="+((double)num1/num2)); 
							// (int + int), "/"�� double -> ��ȯ���ش�.
		System.out.println(num1+"%"+num2+"="+(num1%num2)); //������
		
	}
}
