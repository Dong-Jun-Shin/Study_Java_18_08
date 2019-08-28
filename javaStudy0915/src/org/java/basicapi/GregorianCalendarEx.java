package org.java.basicapi;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarEx {

	public static void main(String[] args) {
		
		//추상클래스 Calendar를 구현
		GregorianCalendar g1 = new GregorianCalendar();
		
		System.out.print(g1.get(Calendar.YEAR)+"년 "); //년
		System.out.print(g1.get(Calendar.MONTH)+1+"월 "); //월
		System.out.print(g1.get(Calendar.DATE)+"일 "); //일
		System.out.print(g1.get(Calendar.HOUR)+"시 "); //시
		System.out.print(g1.get(Calendar.MINUTE)+"분 "); //분
		System.out.println(g1.get(Calendar.SECOND)+"초"); //초
	}
}
