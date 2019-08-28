package org.java.basicapi;

import java.util.Scanner;

public class WrapperEx1 {

	public static void main(String[] args) {
		//박싱(기본타입 -> 참조형)
		Integer i = new Integer(10);
		
		int i2= i.intValue(); // ->int
		float f=i.floatValue(); // ->float
		double d = i.doubleValue(); // ->double
		short s = i.shortValue(); // ->short
		long l = i.longValue(); // ->long
		
		//.parseInt, .toString 꼭 알아두기
		Integer i3 =Integer.parseInt("1111"); //String ->Integer
			//Integer로 변환시 숫자로만 이루어진 문자열이어야 한다.
		System.out.println(i3);
		String str = Integer.toString(10);// 정수 -> String

		System.out.println(Integer.toBinaryString(10)); //2진수
		System.out.println(Integer.toHexString(10)); //16진수
		System.out.println(Integer.toOctalString(10)); //8진수
		
		Scanner scn = new Scanner(System.in);
		Integer n = Integer.parseInt(scn.next());
	}
}
