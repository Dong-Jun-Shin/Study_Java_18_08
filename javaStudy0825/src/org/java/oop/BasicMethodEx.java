package org.java.oop;

public class BasicMethodEx {
  //멤버
	
	private String userId;
	private String userPw;
	
	public static void staticMethod() {
		System.out.println("staticMethod");
	}
	
	
	public void method1() {
		System.out.println("매서드1");
		return;//반환값이 없을 때 생략가능
	}
						//지역변수 : 매개인자 or 매소드 내 변수(반드시 초기화 해야 함)
	public void method2(String userName) {
		System.out.println(userName);
		return;//반환값이 없을 때 생략가능
	}
	
	public int method3() {
		System.out.println("매서드1");
		return 0;// int로 반환해야 해서 반환값이 필요		
	}
	                       //매개변수 >> 지역변수화하기
	public int method4(int num1, int num2) {
		//지역변수
		int sum=num1+num2;
		
		return sum;
	}
}


