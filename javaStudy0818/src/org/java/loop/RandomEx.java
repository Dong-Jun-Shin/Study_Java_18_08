package org.java.loop;

//import java.lang.*;  //�ڹ��� �⺻��Ű��, �ڵ����� import ������

public class RandomEx {

	public static void main(String[] args) {
		/* java.lang.(����������) */
		System.out.println("Math.random()");
		// ���� (������)..

		System.out.println("0~9���� ����");
		System.out.println((int) (Math.random() * 10));
		// 0<=Math.random()<1
		// ����ȯ�� ���� ����ȯ ��ų�� �ۼ�����

		System.out.println("1~10���� ����");
		System.out.println((int) (Math.random() * 10) + 1);

		for (int i = 0; i < 10; i++) {

			System.out.println("1~45���� ����");
			System.out.println((int) (Math.random() * 45) + 1);
		}
	}
}
