package org.java.conditoin;

import java.util.Scanner;

public class IfEx01 {

	public static void main(String[] args) {
		System.out.println("if�� ������ �ϳ��� ��");
		
		Scanner scn=new Scanner(System.in);
		
		int grade=scn.nextInt();
		
		if(grade>=90) {
			System.out.println("A����");
		}
		
		if(grade>=80) System.out.println("B����");
		if(grade>=70) 
					  System.out.println("C����");
	}
}