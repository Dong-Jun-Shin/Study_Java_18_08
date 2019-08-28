package org.java.loop;

public class MathRadomEx1 {

	public static void main(String[] args) {
		System.out.println("0<= Math.random() <1");
		
		System.out.println("난수:"+Math.random());
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("난수:"+Math.random());
			
		}
		System.out.println();
		
		System.out.println("double > int");
		System.out.println((int)Math.random());
		System.out.println();
		
		System.out.println(Math.random()*10);
		System.out.println((int)Math.random()*10);
		
	}
}
