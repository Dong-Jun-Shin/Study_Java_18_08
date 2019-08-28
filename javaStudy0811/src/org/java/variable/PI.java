package org.java.variable;

import java.util.Scanner;

public class PI {

	public static void main(String[] args) {
		System.out.println("final상수 이용한 원의 넓이입니다.");
		System.out.println();
		//radius*radius*PI
		//final 상수를 이용해서 3.14를 PI에 대입
		final double PI = 3.14;
		
		System.out.println("구하고 싶은 넓이의 원지름을 입력해주세요.");
		
		Scanner scn=new Scanner(System.in);
		
		int r = scn.nextInt();
		
		double circle= PI * r * r;
		
		System.out.println("원하는 원의 넓이는 "+circle+" 입니다.");
	}
}
