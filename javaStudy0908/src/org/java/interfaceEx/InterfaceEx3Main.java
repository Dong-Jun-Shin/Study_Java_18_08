package org.java.interfaceEx;

public class InterfaceEx3Main {

	public static void main (String[] args) {
		//인터페이스는 객체를 생성하지 못한다.
		//InterfaceEx3 i1 = new InterfaceEx3;
		
		InterfaceEx3 i0 = new InterfaceEx3Sub();
		i0.excute();
		
		
		
		InterfaceEx1 i1 = new InterfaceEx4Sub();
		i1.excute();
		
		InterfaceEx2 i2=new InterfaceEx4Sub();
		i2.excute();
		i2.excuteQuery();
		
		InterfaceEx3 i3= new InterfaceEx4Sub();
		i3.excute();
		i3.excuteQuery();
		
		
		InterfaceEx4 i4=new InterfaceEx4Sub();
		i4.excute();
		i4.excute2();
		i4.excuteQuery();
		
		InterfaceEx4Sub i5=new InterfaceEx4Sub();
		i5.excute();
		i5.excute2();
		i5.excuteQuery();
		i5.method3();
	}

}