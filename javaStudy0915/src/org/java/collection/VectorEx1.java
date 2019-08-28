package org.java.collection;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {

		Vector<String> v1 = new Vector<>(); // 객체를 쌓아두는 클래스

		v1.add(new String("m1")); // ** 요소 추가
		v1.add("m2");
		v1.add("m3");
		v1.add("m4");
		v1.add("m5");

		System.out.println(v1.size());
		// 백터의 요소 개수, 객체 5개가 쌓여있음.
		
		//v1.clear(); // 요소들을 삭제
		v1.add(0, "m6"); // 인덱스, 값 |* 요소를 추가해준다
		System.out.println(v1.size()); //* 백터의 요소 개수
		
		System.out.println(v1.contains("m1")); //요소가 있는냐?
		System.out.println(v1.contains("m7")); //요소가 있는냐?
		
		System.out.println(v1.elementAt(0)); //요소 get
		
		System.out.println(v1.get(0)); //객체를 인덱스별로 get
		System.out.println(v1.get(1)); //**
		System.out.println(v1.get(2));
		System.out.println(v1.get(3));
		System.out.println(v1.get(4));
		System.out.println(v1.get(5));
		
		System.out.println(v1.isEmpty());
		//v1.clear();
	
		System.out.println(v1.get(0));
		v1.remove(0);
		System.out.println(v1.isEmpty());
		System.out.println(v1.get(0));
	}
}
