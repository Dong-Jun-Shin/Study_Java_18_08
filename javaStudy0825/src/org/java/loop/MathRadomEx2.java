package org.java.loop;

public class MathRadomEx2 {

	public static void main(String[] args) {
		System.out.println("0<= Math.random() <1");
		
		// 0���� 44���� ������ ���.. for, Math.random()
		
		for (int i = 0; i < 10; i++) {
			
			System.out.print((int)(Math.random()*45)+" ");
			
		}
		System.out.println();
		// 1���� 45���� ������ ���.. for, Math.random()
		
		for (int i = 0; i < 10; i++) {
			System.out.print((int)(Math.random()*45+1)+" ");
			//�ߺ��� �� �ִ�.
		}
	}
}
