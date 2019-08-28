package org.java.memberDto;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		//객체를 그룹화
		ArrayList<Integer> list1=new ArrayList<>();
		
		list1.add(new Integer(10));
		list1.add(new Integer(20));
		list1.add(new Integer(30));
		list1.add(new Integer(40));
		list1.add(new Integer(50));
		
		for(Integer i:list1) {
			
			System.out.println(i.intValue());
		}
		
		System.out.println("===================");
		
		ArrayList<MemberDto> members=new ArrayList<>();
		
		members.add(new MemberDto("m1","111","s1",1));
		members.add(new MemberDto("m2","211","s2",2));
		members.add(new MemberDto("m3","311","s3",3));
		members.add(new MemberDto("m4","411","s4",4));
		members.add(new MemberDto("m5","511","s5",5));
		
		System.out.println(members.get(0).getUserId());
		System.out.println(members.get(0).getUserPw());
		System.out.println(members.get(0).getUserName());
		System.out.println(members.get(0).getUserAge());
		
		for(MemberDto dto:members) {
			String userId= dto.getUserId();
			String userPw= dto.getUserPw();
			String userName= dto.getUserName();
			int userAge= dto.getUserAge();
			
			System.out.print("아이디: "+userId+", ");
			System.out.print("비밀번호: "+userPw+", ");
			System.out.print("이름: "+userName+", ");
			System.out.println("나이: "+userAge+" ");
		}
	}
}
