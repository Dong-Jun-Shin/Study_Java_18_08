package org.java.basicapi;

public class StringBufferEx1 {

	public static void main(String[] args) {

		//*String ���ڿ��� ������ �Ұ����ϴ�.*
		String s1 = "java Project";
		String s2 = s1.concat(" 2018"); // ���ο� ���ڿ��� ����
		System.out.println(s1);
		System.out.println(s2); // ���ο� ���ڿ��� ����
		
		System.out.println("===================");

		//*StringBuffer ���ڿ��� ������ ����*
		StringBuffer str1 = new StringBuffer("java Project");
		System.out.println(str1);

		str1.append("2018"); //�⺻ ���ڿ��� ����(�߰�)
		System.out.println(str1);
		
		str1.insert(str1.length(), "_MVC"); //1������ ���ڿ��� ���� �߰�
		System.out.println(str1);
		
		
		
		str1.replace(0, 4, "JSP"); //(���۹���, ������, "�ٲ� ���ڿ�")
		System.out.println(str1);
	}
}


