package org.java.interfaceEx;
						//쿨래스 implements 인터페이스
public class InterfaceEx3Sub implements InterfaceEx3, InterfaceEx1{

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		System.out.println("인터페이스 구현");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("(다중 상속)인터페이스 구현");
	}

	@Override
	public void excuteQuery() {
		// TODO Auto-generated method stub
		
	}
}
