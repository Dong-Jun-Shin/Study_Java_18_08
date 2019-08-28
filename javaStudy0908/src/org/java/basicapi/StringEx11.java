package org.java.basicapi;

public class StringEx11 {

	public static void main(String[] args) {

		//String Ŭ����, ��� ���� ��
		String str1 = "java"; // Ÿ�� ���� ����ϴ� ��Ʈ�� ���ͷ�
		String str2 = "java";
		String str3 = new String("java");
		String str4 = new String("java");
		
		// .equals()�� ���ڸ� ��, ==�� �������� ��� ��
		System.out.println(str1==str2); //true ����
		System.out.println(str1.equals(str2)); //true ����
		System.out.println(str3==str4); //false �ٸ�
		   //new�� �� ������ ����� ���� �����ϴ� ������ ������ ������ش�.
	    System.out.println(str3.equals(str4)); //true ����
	    System.out.println(str1==str3); //false �ٸ�
	    System.out.println(str1.equals(str3)); //true ����
	    
	    //String ���� �Ұ���, ������ ��ġ�°� ����
	    String s1="java";
	    String s2="project";
	    
	    String s3=s1.concat(s2); // �� ���ڿ��� ���Ѵ�.
	    System.out.println(s3);
	    System.out.println(s1);
	    
	    System.out.println("=======================");
	    
	    String s4="abcd";	    
	    String str0 = "java Project";
	    
	    System.out.println(str0.charAt(3)); //index�� �� return
	    	//n��° ���ڸ� ����, 0���� ����, ���� ����
	    System.out.println(s4.compareTo(str0)); //���� �˻� ����
	    	//�� ���ڿ��� ���Ͽ�, ������ ���̸� '-'�� return, ������ '0', �ڸ� '+'
	    System.out.println(str0.contains("java")); // ���ڸ� �˻�
	    	//��, �������� ���
	    System.out.println(str0.length()); //���ڿ� ����(���� ����)
	    
	    
	    System.out.println(str0.replace("java", "JSP")); 
	    System.out.println(str0);
	    	//���� ���ڿ��� Ư�����ڿ��� ��ȯ 
	    	//*�����ϴ°� �ƴ϶�* ��ü�ϰ� ��¸� �Ѵ�. (������ ����X)
	    
	    String phone="010-0000-0000";
	    String[] strArr = phone.split("-"); //return�� *String �迭*�� ���´�.
	    // split(���б�ȣ) -> **�迭�� �߶� ���� (String [])
	    
	    //forEach�� �迭�� �̿밡�� (���...���)
	    for(String arr:strArr) {
	    	System.out.println(arr);
	    }
	    //�Ϲ� for��
	    for(int i=0; i<strArr.length; i++) {
	    	System.out.println(strArr[i]);
	    }
	}
}
