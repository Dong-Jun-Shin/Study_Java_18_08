package org.java.construct;

public class CarMain {
		//구현, 표현의 방식
	public static void main(String[] args) {
		CarDTO c1 = new CarDTO();
		c1.setCarName("ACar");
		c1.setCarYear(2018);
		c1.setCarCoin(1000);
		
		
		System.out.println(c1.getCarName());
		System.out.println(c1.getCarYear());
		System.out.println(c1.getCarCoin());
		
		System.out.println("===================");
		
		CarDTO c2=new CarDTO("Bcar");
		c2.setCarYear(2018);
		c2.setCarCoin(2000);
		
		System.out.println(c2.getCarName());
		System.out.println(c2.getCarYear());
		System.out.println(c2.getCarCoin());
		
		System.out.println("===================");
		
		CarDTO c3=new CarDTO("CCar", 2018);
		c3.setCarCoin(3000);
		
		System.out.println(c3.getCarName());
		System.out.println(c3.getCarYear());
		System.out.println(c3.getCarCoin());
		
		System.out.println("===================");
		
		CarDTO c4=new CarDTO("DCar", 2018, 4000);
		System.out.println(c4.getCarName());
		System.out.println(c4.getCarYear());
		System.out.println(c4.getCarCoin());
	}
}
