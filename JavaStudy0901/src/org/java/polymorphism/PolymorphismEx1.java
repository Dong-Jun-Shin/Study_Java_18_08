package org.java.polymorphism;

class P {
	public int num1;

	public void p1Method() {
		System.out.println("p1Method �޼ҵ�");
	}
}

class S extends P{
	public int num2;
	
	public void s1Method() {
		System.out.println("s1Method �޼ҵ�");
	}
}

public class PolymorphismEx1 {

	public static void main(String[] args) {
		P p=new P();
		P p2=new S(); //����Ÿ���� ��ü ���� -> ���갴ü�� ����
		p2.num1=10;   //(������) ����Ÿ���� ����� ���� ���� (�ٿ�ĳ����)
		
		S s=new S();
		S s2=(S)new P(); //��ĳ����, �� ����ϱ� (����Ÿ�� -> ���۰�ü)
	}
}
