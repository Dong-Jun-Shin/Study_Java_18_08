package org.java.operator;

import java.util.Scanner;

public class LoginEx2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("���̵� �Է�");
		String userId = scn.next();

		System.out.println("��й�ȣ �Է�");
		String userPw = scn.next();

		if (userId.equals("manso") && userPw.equals("1111")) {
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}
		System.out.println();

		if (!userId.equals("manso") || !userPw.equals("1111")) {
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}
	}

}
