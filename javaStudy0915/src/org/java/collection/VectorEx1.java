package org.java.collection;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {

		Vector<String> v1 = new Vector<>(); // ��ü�� �׾Ƶδ� Ŭ����

		v1.add(new String("m1")); // ** ��� �߰�
		v1.add("m2");
		v1.add("m3");
		v1.add("m4");
		v1.add("m5");

		System.out.println(v1.size());
		// ������ ��� ����, ��ü 5���� �׿�����.
		
		//v1.clear(); // ��ҵ��� ����
		v1.add(0, "m6"); // �ε���, �� |* ��Ҹ� �߰����ش�
		System.out.println(v1.size()); //* ������ ��� ����
		
		System.out.println(v1.contains("m1")); //��Ұ� �ִ³�?
		System.out.println(v1.contains("m7")); //��Ұ� �ִ³�?
		
		System.out.println(v1.elementAt(0)); //��� get
		
		System.out.println(v1.get(0)); //��ü�� �ε������� get
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
