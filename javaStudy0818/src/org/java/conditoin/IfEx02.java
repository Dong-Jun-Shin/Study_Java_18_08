package org.java.conditoin;

import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {

		System.out.println("if�� ������ �ΰ�");

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

		if (userId.equals("manso") && userPw.equals("1111")) {
			System.out.println("�α��� ����");
		} else if (!userId.equals("manso") || !userPw.equals("1111")) {
			System.out.println("�α��� ����");
		}
	}
}
