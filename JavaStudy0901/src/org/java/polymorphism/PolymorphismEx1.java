package org.java.polymorphism;

class P {
	public int num1;

	public void p1Method() {
		System.out.println("p1Method 메소드");
	}
}

class S extends P{
	public int num2;
	
	public void s1Method() {
		System.out.println("s1Method 메소드");
	}
}

public class PolymorphismEx1 {

	public static void main(String[] args) {
		P p=new P();
		P p2=new S(); //슈퍼타입의 객체 변수 -> 서브객체를 참조
		p2.num1=10;   //(왼쪽의) 슈퍼타입의 멤버만 접근 가능 (다운캐스팅)
		
		S s=new S();
		S s2=(S)new P(); //업캐스팅, 용어만 기억하기 (서브타입 -> 슈퍼객체)
	}
}
