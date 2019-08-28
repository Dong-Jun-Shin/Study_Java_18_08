package org.java.collection;

import java.util.Vector;

class Car {
	private String name;
	private String year;

	public Car(String name, String year) {
		this.name = name;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
}

public class VectorEx4 {

	public static void main(String[] args) {

		Vector<Car> car = new Vector<>();

		car.add(new Car("c1", "2018"));
		car.add(new Car("c2", "2015"));
		car.add(new Car("c3", "2016"));
		car.add(new Car("c4", "2013"));

		System.out.println(car.size());

		// 0번지 객체
		System.out.println(car.get(0).getYear());
		System.out.println(car.get(0).getName());

		// 1번지 객체
		System.out.println(car.get(1).getYear());
		System.out.println(car.get(1).getName());

		// 2번지 객체
		System.out.println(car.get(2).getYear());
		System.out.println(car.get(2).getName());

		for (int i = 0; i < car.size(); i++) {

			String Cname = car.get(i).getName();
			String Cyear = car.get(i).getYear();

			System.out.println(Cname + ", " + Cyear);
		}

		System.out.println("=============================");

		for (Car c1 : car) {
			System.out.println("자동차년식: " + c1.getYear() + " ");
			System.out.println("자동차명: " + c1.getName() + " ");
			System.out.println("--------------");
		}
	}
}