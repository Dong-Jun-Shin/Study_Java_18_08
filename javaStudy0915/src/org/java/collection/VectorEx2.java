package org.java.collection;

import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {

		Vector<Integer> v1 = new Vector<>();

		v1.add(new Integer(10));
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);

		System.out.println(v1.get(0));
		System.out.println(v1.get(1));
		System.out.println(v1.get(2));
		System.out.println(v1.get(3));
		System.out.println(v1.get(4));
		System.out.println("======================");
		// for
		for (int i = 0; i < v1.size(); i++) {
			int num = v1.get(i); // 자동 언박싱 Integer -> int로
			System.out.println(num);
		}
		System.out.println("======================");
		// foreach
		for (Integer i : v1) {

			int num = i; // <- int i = new Integer(10); 자동언박싱

			System.out.println(i);
		}
		System.out.println("======================");

		Vector<String> v2 = new Vector<>();

		v2.add("m1");
		v2.add("m2");
		v2.add("m3");
		v2.add("m4");
		v2.add("m5");

		for (int i = 0; i < v2.size(); i++) {
			String str = v2.get(i);
			System.out.println(str);
		}
		System.out.println("====================='");
		
		for(String str:v2) {
			String s1=str;
			System.out.println(s1);
		}
	}
}
