package org.java.operator;

public class OperatorEx06 {

	public static void main(String[] args) {
		System.out.println("==, equals ����");
				
				// "==" �޸� ����, ��ü�����ͱ��� ��
				// ".equals" ��ü �����͸� ��

				// ����Ʈ 101ȣ, 102ȣ, 103ȣ | �� ���� �ƺ���
		String str1=new String("���ڿ�");
		String str2=new String("���ڿ�");
		String str3="���ڿ�";
		String str4="���ڿ�";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str2==str3);
		
		System.out.println();
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
		
		
	}
}
