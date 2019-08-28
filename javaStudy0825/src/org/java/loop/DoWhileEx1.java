package org.java.loop;

public class DoWhileEx1 {
	public static void main(String[] args) {

		System.out.println("do~while");
		
		int num=10;
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("--------");
		
		while (num<10) {
			System.out.println(num);
		}
		
		System.out.println("-------");
		
		do {
			
			System.out.println(num);
			
			num++;
		}while(num<10);
	}
}
