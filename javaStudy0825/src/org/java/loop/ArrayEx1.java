package org.java.loop;

public class ArrayEx1 {

	public static void main(String[] args) {
		System.out.println("�迭");

		/*
		 * �ڹ��� �⺻ �ڷ���(primitive type) 1 2 4 8 ������ byte short int long �Ǽ��� float double
		 * ������ char ���� boolean
		 * 
		 * ������ : �迭, String, class, interface : ..new�����ڸ� �̿��ؼ� ��ü�� �ּҰ��� ����. ..��ü�� �ּҰ�����
		 * ��ü�� ����� ����(.)
		 * 
		 */

		// int���� data�� ������ �� �ִ� �迭 arrInt�� �����ߴ�.
		// int (data)5���� ������ �� �ִ� �迭 ��ü ����
		// new �ּҰ��� ����..
		// �迭 �̸����� �迭�� �ּҰ� ����
		// 1. �迭 ����
		int[] arrInt = new int[5];
		// �迭 �ʱ�ȭ
		arrInt[0] = 10; // �迭�� �ε����� 0�������� ����
		arrInt[1] = 20;
		arrInt[2] = 30;
		arrInt[3] = 40;
		arrInt[4] = 50;

		System.out.println("�迭�� ����: " + arrInt.length); // �迭�� ����
		System.out.println("arrInt[0]=" + arrInt[0]); // 0����
		System.out.println("arrInt[1]=" + arrInt[1]);
		System.out.println("arrInt[2]=" + arrInt[2]);
		System.out.println("arrInt[3]=" + arrInt[3]);
		System.out.println("arrInt[4]=" + arrInt[4]);
		System.out.println();

		// �迭�� �ݺ���(for)�� ���� ���

		int[] arrInt2 = new int[5];

		for (int i = 0; i < arrInt2.length; i++) {
			arrInt2[i] = 10 * i; //

		}

		for (int i = 0; i < arrInt2.length; i++) {

			System.out.println("arrInt[" + i + "]=" + arrInt[i]);

		}
	}
}
