package org.java.loop;

public class WhileEx2 {

	public static void main(String[] args) {
		System.out.println("while");
		
		//2�� ~ 9�ܱ��� ������ ��� 2*1=2 2*2=4...
		
		int i=2;
		
		while(i<10) {
			System.out.println(i+"���Դϴ�.");
			
			int j=1;
			
			while(j<10) {
				
				System.out.println(i+"*"+j+"="+(i*j));
				
				j++;
			}
			i++;
		}
	}
}
