package org.java.oop;

public class BasicClass {
	//멤버

	//멤버(필드)
	private String userId; //(필드)인스턴스 멤버
	public int userAge;   //(필드)인스턴스 멤버 (객체를 생성 한 후 접근)
	
	public static String projectName; //클래스 멤버 (=static 멤버(객체를 생성 안해도 됨))

	//인스턴스 멤버- 객체의 생성, 소멸에 따라 생성, 종료
	//클래스 멤버- 클래스의 생성, 소멸에 따라 생성, 종료
	
	
	
	public static void staticMethed() {
		System.out.println("static 매서드");
	}
	
	//멤버(매서드) 인스턴스 멤버(객체를 생성한 후 접근)
	public void method1() {
		System.out.println("매서드1");
	}

	public void method2(String name) {
		System.out.println("매서드2");
		System.out.println(name);
	}

	public int method3(int num1, int num2) {

		System.out.println("매서드3");
		return num1 + num2;
	}
}
