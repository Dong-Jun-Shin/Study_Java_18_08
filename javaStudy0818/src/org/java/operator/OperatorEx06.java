package org.java.operator;

public class OperatorEx06 {

	public static void main(String[] args) {
		System.out.println("==, equals 차이");
				
				// "==" 메모리 공간, 자체데이터까지 비교
				// ".equals" 자체 데이터만 비교

				// 아파트 101호, 102호, 103호 | 각 집의 아빠들
		String str1=new String("문자열");
		String str2=new String("문자열");
		String str3="문자열";
		String str4="문자열";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str2==str3);
		
		System.out.println();
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
		
		
	}
}
