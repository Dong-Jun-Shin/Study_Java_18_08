package org.java.basicapi;

import java.util.Scanner;

public class WrapperEx22 {

	public static void main(String[] args) {
		int i = 10;

		// �⺻ -> ����(�ڽ�)
		Integer i1 = new Integer(i);

		// �ڵ� �ڽ�(auto)
		Integer i2 = 20; 
		Float f1 = 1.1f;
		Boolean bool1= false;
		
		Integer i3 = new Integer(10);
		
		//���� -> �⺻(��ڽ�)
		int i4= i3.intValue();
		
		//�ڵ���ڽ�
		int i5= new Integer(10);
		float f2=new Float(1.1f);
		
		Scanner scn=new Scanner(System.in);
		
		//String ->Integer
		      int result = Integer.parseInt(scn.next()); //Auto UnBoxing
		//Integer result = Integer.parseInt(scn.next()); //UnBoxing
	}
}