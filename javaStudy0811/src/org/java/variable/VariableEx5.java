package org.java.variable;

public class VariableEx5 {

	public static void main(String[] args) {
		System.out.println("사용자 정의 타입");
		
		int num=10;
		
		//new sub의 주소값을 생성
		sub s1=new sub();
		//객체 참조변수 s1
		s1.num1=10;
	}
}
