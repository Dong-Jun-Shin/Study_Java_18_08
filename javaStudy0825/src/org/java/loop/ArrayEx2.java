package org.java.loop;

public class ArrayEx2 {

	public static void main(String[] args) {
		System.out.println("�迭");

		// �迭�� ���� ���
		int[] arrInt = new int[5];
		int[] arrInt2 = new int[] { 10, 20, 30, 40, 50 };
		int[] arrInt3 = { 10, 20, 30, 40, 50 };

		char[] ch = new char[5];
		char[] ch2 = { 'a', 'b', 'c', 'd', 'e' }; // char�� �迭
		String[] str = { "m", "a", "a", "s", "o" };// String�� �迭

		String strCh = new String(ch); // char�迭�� String(���ڿ�) ��ȯ
		System.out.println(strCh);
	}
}