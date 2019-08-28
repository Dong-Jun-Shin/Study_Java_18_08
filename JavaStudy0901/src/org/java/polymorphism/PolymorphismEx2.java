package org.java.polymorphism;

class Parent{
	public void excute() {
		System.out.println("Parent 메소드");
	}
	
}

class Sub1 extends Parent{
	@Override
	public void excute() {
		System.out.println("안녕 난 1이야");
	}
}

class Sub2 extends Parent{
	@Override
	public void excute() {
		System.out.println("안녕 난 2야");
	}
}

class Sub3 extends Parent{
	@Override
	public void excute() {
		System.out.println("안녕 난 3이야");
	}
}




public class PolymorphismEx2 {
	public static void main(String[] args) {
		
		// 다형성
		
		Parent p = new Sub1();
		p.excute();
		
		p=new Sub2();
		p.excute();
		
		p=new Sub3();
		p.excute();
	}
}
