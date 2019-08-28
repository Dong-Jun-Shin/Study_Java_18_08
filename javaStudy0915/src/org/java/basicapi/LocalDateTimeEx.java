package org.java.basicapi;

import java.time.LocalDateTime;

public class LocalDateTimeEx {

	public static void main(String[] args) {
		
		LocalDateTime loc= LocalDateTime.now();
		
		System.out.println(loc); 
		// YYYY-MM-DDTHH:MM:SS.NNN 으로 출력, T(Time)로 날짜, 시간 구분
		
		System.out.println(loc.getYear());
		System.out.println(loc.getMonthValue());
		System.out.println(loc.getDayOfMonth());
		System.out.println(loc.getHour());
		System.out.println(loc.getMinute());
		System.out.println(loc.getSecond());
		System.out.println(loc.getNano());
		
		System.out.println("=======================");
		LocalDateTime tarTimeD=LocalDateTime.of(2018, 05,04,20,00,01);
		//초가 0초이면 생략
		System.out.println(tarTimeD);
	}
}
