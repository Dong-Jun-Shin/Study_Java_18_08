package org.java.abstractEx;

public abstract class AbstractEx1 {

	public int num1; //인스턴스 멤버
	public static int num2; //클래스 멤버
	
	
	public void method() {
		System.out.println("인스턴스 멤버");
	}
	
	public abstract void abstractMethod();// 추상메소드
}
