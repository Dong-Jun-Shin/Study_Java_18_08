package org.java.basicapi;

public class StringEx2 {

	public static void main(String[] args) {

		String url1 = "MemberInsert.do";
		String url2 = "MemberUpdate.do";
		String url3 = "Select.do";
		String url4 = "DBMemberDelete.do";

		String num = "123456789"; // 배열(char)
		String s1 = num.substring(0); // 0번지 - get
		System.out.println(num.substring(0, 5));
		System.out.println(s1);

		// .substring(index); // index부터 문자를 get
		System.out.println(num.substring(5));
		System.out.println(url1.length());

		System.out.println(url1.substring(url1.length() - 3));
		System.out.println(url2.substring(url2.length() - 3));
		System.out.println(url3.substring(url3.length() - 3));
		System.out.println(url4.substring(url4.length() - 3));

		// 배열의 총 개수보다 총 인덱스 수는 1 작다
		System.out.println("=====================");

		url1 = "MemberInsert.do";
		url2 = "MemberUpdate.do";
		url3 = "Select.do";
		url4 = "DBMemberDelete.do";

		System.out.println(url1.substring(0, 12)); // 12개의 문자
		System.out.println(url2.substring(0, 12)); // 12개의 문자
		System.out.println(url3.substring(0, 6)); // 6개의 문자
		System.out.println(url4.substring(0, 14)); // 14개의 문자
		System.out.println("========================");
		System.out.println(url1.substring(0, url1.length() - 3));
		System.out.println(url2.substring(0, url2.length() - 3));
		System.out.println(url3.substring(0, url3.length() - 3));
		System.out.println(url4.substring(0, url4.length() - 3));

		// substring(a,b); //a번지부터 (b-a)개수만큼 get

		String exStr1 = "insert.do";
		System.out.println(exStr1.substring(0, 6));

		String exStr2 = "DBinsert.do";
		System.out.println(exStr2.substring(2, 8));
		
		String exStr3 = "DBMemberInsert.do";
		System.out.println(exStr3.substring(8, 14));

	}
}
