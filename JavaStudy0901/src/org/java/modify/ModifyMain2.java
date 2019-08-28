package org.java.modify;

//같은 패키지 클래스
public class ModifyMain2 {

	public static void main(String[] args) {
		
		ModifyEx1 m1 = new ModifyEx1();
		m1.num1 = 10;
		m1.num3 = 20;
		m1.num4 = 40;
		m1.setNum2(100);
		m1.getNum2();

		ModifyEx2 m2 = new ModifyEx2();
		m2.num1 = 10;
		m2.num3 = 20;
		m2.num4 = 40;

	}
}
