package org.java.basicapi;

import java.util.Scanner;

public class WrapperEx1 {

	public static void main(String[] args) {
		//�ڽ�(�⺻Ÿ�� -> ������)
		Integer i = new Integer(10);
		
		int i2= i.intValue(); // ->int
		float f=i.floatValue(); // ->float
		double d = i.doubleValue(); // ->double
		short s = i.shortValue(); // ->short
		long l = i.longValue(); // ->long
		
		//.parseInt, .toString �� �˾Ƶα�
		Integer i3 =Integer.parseInt("1111"); //String ->Integer
			//Integer�� ��ȯ�� ���ڷθ� �̷���� ���ڿ��̾�� �Ѵ�.
		System.out.println(i3);
		String str = Integer.toString(10);// ���� -> String

		System.out.println(Integer.toBinaryString(10)); //2����
		System.out.println(Integer.toHexString(10)); //16����
		System.out.println(Integer.toOctalString(10)); //8����
		
		Scanner scn = new Scanner(System.in);
		Integer n = Integer.parseInt(scn.next());
	}
}
