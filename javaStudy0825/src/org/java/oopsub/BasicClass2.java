package org.java.oopsub;

public class BasicClass2 {

	public int userAge;
	private String userName;
	public static final String PROJECTNAME="PROJECT2018";
	//공유, 한번만 초기화 가능
	
	public void method5() {
		System.out.println("BasicClass2 클래스 매서드 public");
		
	}
	
	void method6() { //default(기본)
		System.out.println("BasicClass2 클래스 접근제한자 default");
		
	}
}
