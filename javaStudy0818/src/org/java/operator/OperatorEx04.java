package org.java.operator;

public class OperatorEx04 {

	public static void main(String[] args) {
		System.out.println("문자열 비교");
			
			//객체 참조변수는 생성된 객체의 주소값을 저장
		
		String str1=new String("문자열");
		String str2=new String("문자열");
		
		//객체1.equals(str2) 객체의 문자열을 비교
		
		System.out.println(str1.equals(str2)); //문자열을 비교
		
		System.out.println(str1==str2);
	}
}
