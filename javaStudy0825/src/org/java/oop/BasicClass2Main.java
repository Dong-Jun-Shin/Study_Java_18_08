package org.java.oop;

import org.java.oopsub.BasicClass2;

public class BasicClass2Main {

	public static void main(String[] args) {

		System.out.println("프로젝트명: "+BasicClass2.PROJECTNAME);
		
		BasicClass2 c1 = new BasicClass2();
		// 클래스 인스턴스화

		c1.userAge = 10; // 모든 클래스는 object 클래스의 상속을 받는다.
		                 //   ->어디서든 object의 매서드 사용 가능
		c1.method5();
		
		System.out.println("나이: "+c1.userAge);
	}
}
