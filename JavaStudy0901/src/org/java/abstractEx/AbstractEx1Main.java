package org.java.abstractEx;

public class AbstractEx1Main {

	public static void main(String[] args) {
		
		
		AbstractEx1Sub a1=new AbstractEx1Sub();
		a1.abstractMethod();
		
		AbstractEx1 a2=new AbstractEx1Sub();
		a2.abstractMethod();
		
		AbstractEx1Sub2sub a3=new AbstractEx1Sub2sub();
		a3.abstractMethod();
		a3.abstractMethod2();
		
		AbstractEx1 a4=new AbstractEx1Sub2sub();
		a4.abstractMethod();
	
		
		AbstractEx1Sub2 a5 = new AbstractEx1Sub2sub();
		a5.abstractMethod();
		a5.abstractMethod2();
		
	}
}
