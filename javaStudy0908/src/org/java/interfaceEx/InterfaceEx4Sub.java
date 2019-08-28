package org.java.interfaceEx;

public class InterfaceEx4Sub implements InterfaceEx4{

	//인터페이스로 상속 한 것의 오버라이딩은 사용목적 여부 상관없이 모두 써야한다.
	//클래스의 경우, 안 그래도 된다.
	
	//사용하고 싶은 추상메소드
	@Override
	public void excute() { 
		// TODO Auto-generated method stub
		System.out.println("excute 메소드");
	} 

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("method3");
	}

	@Override
	public void excuteQuery() {
		// TODO Auto-generated method stub
		System.out.println("excuteQuery");
	}

	@Override
	public void excute2() {
		// TODO Auto-generated method stub
		System.out.println("excute2");
	}

}

