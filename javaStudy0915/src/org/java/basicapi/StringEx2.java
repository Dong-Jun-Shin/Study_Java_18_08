package org.java.basicapi;

public class StringEx2 {

	public static void main(String[] args) {

		String url1 = "MemberInsert.do";
		String url2 = "MemberUpdate.do";
		String url3 = "Select.do";
		String url4 = "DBMemberDelete.do";

		String num = "123456789"; // �迭(char)
		String s1 = num.substring(0); // 0���� - get
		System.out.println(num.substring(0, 5));
		System.out.println(s1);

		// .substring(index); // index���� ���ڸ� get
		System.out.println(num.substring(5));
		System.out.println(url1.length());

		System.out.println(url1.substring(url1.length() - 3));
		System.out.println(url2.substring(url2.length() - 3));
		System.out.println(url3.substring(url3.length() - 3));
		System.out.println(url4.substring(url4.length() - 3));

		// �迭�� �� �������� �� �ε��� ���� 1 �۴�
		System.out.println("=====================");

		url1 = "MemberInsert.do";
		url2 = "MemberUpdate.do";
		url3 = "Select.do";
		url4 = "DBMemberDelete.do";

		System.out.println(url1.substring(0, 12)); // 12���� ����
		System.out.println(url2.substring(0, 12)); // 12���� ����
		System.out.println(url3.substring(0, 6)); // 6���� ����
		System.out.println(url4.substring(0, 14)); // 14���� ����
		System.out.println("========================");
		System.out.println(url1.substring(0, url1.length() - 3));
		System.out.println(url2.substring(0, url2.length() - 3));
		System.out.println(url3.substring(0, url3.length() - 3));
		System.out.println(url4.substring(0, url4.length() - 3));

		// substring(a,b); //a�������� (b-a)������ŭ get

		String exStr1 = "insert.do";
		System.out.println(exStr1.substring(0, 6));

		String exStr2 = "DBinsert.do";
		System.out.println(exStr2.substring(2, 8));
		
		String exStr3 = "DBMemberInsert.do";
		System.out.println(exStr3.substring(8, 14));

	}
}
