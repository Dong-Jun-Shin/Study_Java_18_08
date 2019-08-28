package org.java.basicapi;

class Basic{
	int num;
	void method() {
		System.out.println("method");
		
	}
}

public class ObjectEx0 {

	public static void main(String[] args) {
		
		Basic b1= new Basic();
		Basic b2= new Basic();
		
		//객체의 클래스 정보
		System.out.println(b1.getClass());
		System.out.println(b2.getClass().getName());
		System.out.println(b1.getClass().getName());
		System.out.println(b2.getClass());
		
		//hashCode 객체마다 다르다.
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		
		//toString()"객체를 문자열로 반환"
		System.out.println(b1.toString());
		System.out.println(b2.toString());
	}
}