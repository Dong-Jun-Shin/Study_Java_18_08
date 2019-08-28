package org.java.modifySub;

import org.java.modify.ModifyEx1;


//다른 패키지 클래스
public class ModifyMain1 {

	public static void main(String[] args) {

		ModifyEx1 m1 = new ModifyEx1();
		m1.num1=10;
		m1.setNum2(100);
		m1.getNum2();
		
		
	}

}
