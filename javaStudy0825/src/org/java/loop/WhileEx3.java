package org.java.loop;

import java.util.Scanner;

public class WhileEx3 {

	public static void main(String[] args) {
		System.out.println("while");
		
		System.out.println("시작구구단을 입력하세요 (정수 2~9)");
		
		Scanner scn=new Scanner(System.in); //콘솔에 data를 입력
		
		int startNum = scn.nextInt(); // 정수형 (int) data를 입력
		
		while (startNum<10) {
			System.out.println(startNum+"단입니다");
			
			int j=1;
			
			while(j<10) {
				System.out.println(startNum+"*"+j+"="+(startNum*j));
			
				j++;
			}
			
			startNum++;
		}
	}	
}
