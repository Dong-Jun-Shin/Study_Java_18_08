package org.java.collection;

import java.util.Scanner;
import java.util.Vector;

public class VectorEx3 {
	/*
	 * Vector<String> Id = new Vector<>(); Vector<String> Pw = new Vector<>();
	 * Vector<Integer> Age = new Vector<>(); Vector<String> Name = new Vector<>();
	 * 
	 * Scanner scn = new Scanner(System.in);
	 * 
	 * String id = scn.next(); String pw = scn.next(); String age = scn.next();
	 * String name = scn.next();
	 * 
	 * Id.add(MemberDto.setuserId(id)); Pw.add(MemberDto.setuserPw(pw));
	 * Age.add(MemberDto.setuserAge(age)); Name.add(MemberDto.setuserName(name));
	 */
	public static void main(String[] args) {

		Vector<String> v1 = new Vector<>();
		v1.add("m1");
		v1.add("m2");
		v1.add("m3");
		v1.add("m4");
		v1.add("m5");

		for (String str : v1) {
			System.out.println(str);
		}
		
		System.out.println("====================");
		
		Vector<MemberDto> v2=new Vector<>();
		
		/*
		MemberDto a1=new MemberDto("m1","1111", 11, "son1");
		MemberDto a2=new MemberDto("m2","2111", 21, "son2");
		MemberDto a3=new MemberDto("m3","3111", 31, "son3");
		MemberDto a4=new MemberDto("m4","4111", 41, "son4");
		MemberDto a5=new MemberDto("m5","5111", 51, "son5");
		*/ //�̷��� �� �ʿ䰡 ����. �ؿ� �÷������� �ٷ� �߰���Ű�� get���� �����Ա� ����
		
		v2.add(new MemberDto("m1","1111", 11, "son1"));
		v2.add(new MemberDto("m2","2111", 21, "son2"));
		v2.add(new MemberDto("m3","3111", 31, "son3"));
		v2.add(new MemberDto("m4","4111", 41, "son4"));
		v2.add(new MemberDto("m5","5111", 51, "son5"));
		
		/*
		String userId = v2.get(0).getUserId();
		String userPw = v2.get(0).getUserPw();
		int userAge = v2.get(0).getUserAge();
		String userName = v2.get(0).getUserName();
		
		System.out.print("���̵�: "+userId+", ");
		System.out.print("��й�ȣ: "+userPw+", ");
		System.out.print("����: "+userAge+", ");
		System.out.println("�̸�: "+userName);
		*/
		
		for(int i=0; i<v2.size(); i++) {
			String userId = v2.get(i).getUserId();
			String userPw = v2.get(i).getUserPw();
			int userAge = v2.get(i).getUserAge();
			String userName = v2.get(i).getUserName();
			
			System.out.print("���̵�: "+userId+", ");
			System.out.print("��й�ȣ: "+userPw+", ");
			System.out.print("����: "+userAge+", ");
			System.out.println("�̸�: "+userName);
		}
	
		System.out.println("====================");
		
		for(MemberDto dto:v2) {
			
			// System.out.println(dto); 
			// 0�� ��ü�� ����������.
			// -> v2.get(i) = dto
			
			String userId = dto.getUserId();
			String userPw = dto.getUserPw();
			int userAge = dto.getUserAge();
			String userName = dto.getUserName();
			
			System.out.print("���̵�: "+userId+", ");
			System.out.print("��й�ȣ: "+userPw+", ");
			System.out.print("����: "+userAge+", ");
			System.out.println("�̸�: "+userName);
			
		}
		
	}
}
