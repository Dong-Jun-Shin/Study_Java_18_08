package org.java.variable;

public class VariableEx3 {

	public static void main(String[] args) {

		// 한 줄 주석(설명글)
		
		/*
		 * 여러줄 주석 
		 * (*로 열고 닫는다)
		 * 
		*/
		
		System.out.println("변수");
		
		//자바의 기본 타입(primitive type)
		//변수에 값을 직접 입력(대입)
		
		//정수형
		byte b=127; // 1byte
		short s=10;// 2byte
		int i=10;  // 4byte
		long l=10; // 8byte
		
		//실수형
		float f=1.1f; //4byte
		double d=1.1; //8byte
		
		//문자형 '한글자'
		char ch='a';  //2byte...아스키코드
		
		//논리형
		boolean bool=false; //1byte
			
		System.out.println("byte b="+b);
		
		
		}
}