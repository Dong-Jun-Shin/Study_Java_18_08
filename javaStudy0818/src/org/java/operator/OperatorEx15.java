package org.java.operator;

public class OperatorEx15 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("img/bg"+i+".jpg");
		}
		System.out.println();
		//A ~ Z
		System.out.println('A');
		System.out.println((int)'Z');
		System.out.println((char)65);
		
		for(int i=65; i<91; i++) {
			System.out.println(((char)i)+" ");
		}
		//대문자 65~90
		for(int i=97; i<123; i++) {
			System.out.println(((char)i)+" ");
		}
		//소문자 97~122
	}
}
