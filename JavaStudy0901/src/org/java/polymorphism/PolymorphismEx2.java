package org.java.polymorphism;

class Parent{
	public void excute() {
		System.out.println("Parent �޼ҵ�");
	}
	
}

class Sub1 extends Parent{
	@Override
	public void excute() {
		System.out.println("�ȳ� �� 1�̾�");
	}
}

class Sub2 extends Parent{
	@Override
	public void excute() {
		System.out.println("�ȳ� �� 2��");
	}
}

class Sub3 extends Parent{
	@Override
	public void excute() {
		System.out.println("�ȳ� �� 3�̾�");
	}
}




public class PolymorphismEx2 {
	public static void main(String[] args) {
		
		// ������
		
		Parent p = new Sub1();
		p.excute();
		
		p=new Sub2();
		p.excute();
		
		p=new Sub3();
		p.excute();
	}
}
