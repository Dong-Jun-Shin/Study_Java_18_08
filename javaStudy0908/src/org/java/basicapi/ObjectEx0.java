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
		
		//��ü�� Ŭ���� ����
		System.out.println(b1.getClass());
		System.out.println(b2.getClass().getName());
		System.out.println(b1.getClass().getName());
		System.out.println(b2.getClass());
		
		//hashCode ��ü���� �ٸ���.
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		
		//toString()"��ü�� ���ڿ��� ��ȯ"
		System.out.println(b1.toString());
		System.out.println(b2.toString());
	}
}