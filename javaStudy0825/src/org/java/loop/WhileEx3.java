package org.java.loop;

import java.util.Scanner;

public class WhileEx3 {

	public static void main(String[] args) {
		System.out.println("while");
		
		System.out.println("���۱������� �Է��ϼ��� (���� 2~9)");
		
		Scanner scn=new Scanner(System.in); //�ֿܼ� data�� �Է�
		
		int startNum = scn.nextInt(); // ������ (int) data�� �Է�
		
		while (startNum<10) {
			System.out.println(startNum+"���Դϴ�");
			
			int j=1;
			
			while(j<10) {
				System.out.println(startNum+"*"+j+"="+(startNum*j));
			
				j++;
			}
			
			startNum++;
		}
	}	
}
