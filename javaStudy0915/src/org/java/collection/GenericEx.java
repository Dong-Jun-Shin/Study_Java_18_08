package org.java.collection;

class A {
	int num1;

	public int m1(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
}

class B {
	String num1;

	public String m1(String num1, String num2) {
		String sum = num1 + num2;
		return sum;
	}
}

class GenericEx1<T> { 
	
	// T(Type) 추후에 구현할때 string 등등 참조형 타입(객체만)을 
	// 적어서 정해준다. -> *제네릭타입은 객체 타입만 사용*
	T num1;

	public T m1(T num1) {

		T sum = num1;

		return sum;
	}
}

public class GenericEx {

	public static void main(String[] args) {
		A a = new A();
		a.num1 = 10;
		a.m1(10, 20);

		B b = new B();
		b.num1 = "manso";
		b.m1("m1", "son");
		
		GenericEx1<String> g1=new GenericEx1();
		GenericEx1<Short> g2 = new GenericEx1();
		GenericEx1<Long> g3 = new GenericEx1();
		GenericEx1<Integer> g4=new GenericEx1(); 
		//Wrapper 클래스을 활용
		
		g2.num1=1100;
	}
}
