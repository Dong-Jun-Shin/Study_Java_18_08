package org.java.loop;

public class ArrayEx3 {

	public static void main(String[] args) {
		System.out.println("�迭");

		char[] ch = { 'a', 'b', 'c', 'd', 'e' };

		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		System.out.println();
		// foreach, ��ü, �迭�� �ݺ���
		// jsp >> JSTL foreach
		for (char cData : ch) {
			System.out.print(cData + " ");
		}
		System.out.println();

		int[] arrInt = { 10, 20, 30, 40, 50 };
		
		for (int i = 0; i < ch.length; i++) {
			System.out.print(arrInt[i] + " ");
		}
		System.out.println();
		
		for (int iData : arrInt) {
			System.out.print(iData + " ");
		}
		/*
		 * Ÿ�� :
		 * 
		 * for(Ÿ�� ����:�迭�̸�){ ����; �ڵ����� �迭�� 0�������� ���� }
		 */
	}
}
