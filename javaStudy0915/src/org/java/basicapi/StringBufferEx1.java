package org.java.basicapi;

public class StringBufferEx1 {

	public static void main(String[] args) {

		//*String 문자열의 수정이 불가능하다.*
		String s1 = "java Project";
		String s2 = s1.concat(" 2018"); // 새로운 문자열이 생성
		System.out.println(s1);
		System.out.println(s2); // 새로운 문자열이 생성
		
		System.out.println("===================");

		//*StringBuffer 문자열의 수정이 가능*
		StringBuffer str1 = new StringBuffer("java Project");
		System.out.println(str1);

		str1.append("2018"); //기본 문자열을 수정(추가)
		System.out.println(str1);
		
		str1.insert(str1.length(), "_MVC"); //1번지에 문자열을 새로 추가
		System.out.println(str1);
		
		
		
		str1.replace(0, 4, "JSP"); //(시작번지, 끝번지, "바꿀 문자열")
		System.out.println(str1);
	}
}


