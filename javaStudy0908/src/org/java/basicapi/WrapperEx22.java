package org.java.basicapi;

import java.util.Scanner;

public class WrapperEx22 {

	public static void main(String[] args) {
		int i = 10;

		// 기본 -> 참조(박싱)
		Integer i1 = new Integer(i);

		// 자동 박싱(auto)
		Integer i2 = 20; 
		Float f1 = 1.1f;
		Boolean bool1= false;
		
		Integer i3 = new Integer(10);
		
		//참조 -> 기본(언박싱)
		int i4= i3.intValue();
		
		//자동언박싱
		int i5= new Integer(10);
		float f2=new Float(1.1f);
		
		Scanner scn=new Scanner(System.in);
		
		//String ->Integer
		      int result = Integer.parseInt(scn.next()); //Auto UnBoxing
		//Integer result = Integer.parseInt(scn.next()); //UnBoxing
	}
}