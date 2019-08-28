package org.java.interfaceEx;

public interface InterfaceEx1 {

	// public int num1; -> 인터페이스이기 때문에 오류
	public static final String INSTANCE = "PROJECT";

	// final 상수(한 번만 초기화)
	public abstract void excute(); // 추상메서드

	default void method() {
		System.out.println("defalut 메소드");
	}

	public static void method2() {
		System.out.println("static 메소드");
	}

	void method3(); // public abstract- 생략

	/*
	 * //인스턴스 생성 불가 
	 * public void method3() {
	 *  	System.out.println("인스턴스 메소드"); 
	 * }
	 * 
	 */
}
