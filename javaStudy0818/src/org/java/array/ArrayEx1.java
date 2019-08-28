package org.java.array;

public class ArrayEx1 {

	public static void main(String[] args) {
		System.out.println("¹è¿­");
		
		int[] arrInt= new int[5];
		
		arrInt[0]=(int)(Math.random()*999)+1;
		arrInt[1]=3;
		arrInt[2]=6;
		arrInt[3]=7;
		arrInt[4]=9;
		
		System.out.println(arrInt[(int)(Math.random()*5)]);
	}
}
