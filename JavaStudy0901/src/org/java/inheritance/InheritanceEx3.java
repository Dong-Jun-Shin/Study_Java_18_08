package org.java.inheritance;

class SuperClass{
	public void superMethod() {
		System.out.println("����Ŭ����");
	}
}

class SubClass1 extends SuperClass{
	
	@Override
	public void superMethod() {
		System.out.println("�������̵� �޼ҵ�");
	}
}

class SubClass2 extends SuperClass{
	@Override
	public void superMethod() {
		System.out.println("�ɾ���̵� �����");
	}
}

public class InheritanceEx3 {
	
	public static void main(String[] args) {
		
		SubClass1 s1=new SubClass1();
		s1.superMethod();
		
		SubClass2 s2=new SubClass2();
		s2.superMethod();
	}
}
