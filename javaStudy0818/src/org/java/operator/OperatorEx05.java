package org.java.operator;

import java.util.Scanner;

public class OperatorEx05 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("���̵� �Է��ϼ���");
		String userId=scn.next(); //���ڿ��� �Է�
		
		System.out.println("�н����带 �Է��ϼ���");
		String userPw=scn.next(); //���ڿ��� �Է�
		
		System.out.println("���̵�: "+userId);
		System.out.println("��й�ȣ: "+userPw);
		
		System.out.println(userId.equals("manso"));
		System.out.println(userPw.equals("1111"));
		
		
		if(userId.equals("manso")) {
			System.out.println("���̵� �½��ϴ�.");
		}else {
			System.out.println("���̵� Ʋ���ϴ�.");
		}
		
		if(userPw.equals("1111")) {
			System.out.println("��й�ȣ�� �½��ϴ�.");
		}else {
			System.out.println("��й�ȣ�� Ʋ���ϴ�.");
		}
		
		if(userId.equals("manso")&&userPw.equals("1111")) {
			System.out.println("�α��� �Ǿ����ϴ�.");
		}else {
			System.out.println("���̵� �Ǵ� ��й�ȣ�� Ʋ���ϴ�.");
		}
		
		
	}
}
