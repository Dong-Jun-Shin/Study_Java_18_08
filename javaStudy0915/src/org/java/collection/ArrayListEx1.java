package org.java.collection;

import java.util.ArrayList;

class Car2 {
	private String name;

	public Car2(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class ArrayListEx1 {

	public static void main(String[] args) {

		ArrayList<Integer> a0 = new ArrayList<>();

		a0.add(new Integer("m1")); // 숫자 아닌 객체임
		a0.add(new Integer("m2"));
		a0.add(new Integer("m3"));
		a0.add(new Integer("m4"));
		a0.add(new Integer("m5"));

		for (int i = 0; i < a0.size(); i++) {
			System.out.println(a0.get(i));
		}

		System.out.println("======================");

		ArrayList<Car2> a1 = new ArrayList<>();

		a1.add(new Car2("m1")); // 숫자 아닌 객체임
		a1.add(new Car2("m2"));
		a1.add(new Car2("m3"));
		a1.add(new Car2("m4"));
		a1.add(new Car2("m5"));

		a1.get(0).getName();

		for (int i = 0; i < a1.size(); i++) {
			String a2 = a1.get(i).getName();// + .intValue();
			// intValue()를 안 적어도 된다. -자동언박싱

			System.out.println("이름 : " + a2);
			// 숫자 아닌 객체라서 int로 변경해준다.
		}

		System.out.println("====================");

		for (Car2 c : a1) {

			System.out.println(c.getName());
		}

		
		//나중에 오류 해결하기
	}
}
