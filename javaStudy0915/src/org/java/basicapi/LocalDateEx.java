package org.java.basicapi;

import java.time.LocalDate;

public class LocalDateEx {

	public static void main(String[] args) {

		LocalDate cuDate = LocalDate.now(); // 현재 년월일, 날짜 정보만

		System.out.println(cuDate);
		System.out.println("===========================");

		// System.out.println(cuDate.get-); // getYear(), getMonth()...
		System.out.println(cuDate.getYear()); // 년
		System.out.println(cuDate.getDayOfYear()); // 년의 날짜
		System.out.println(cuDate.getMonth()); // 월
		// GregorianCalendar는 +1을 해주지만, LocalDate의 getMonth는 그냥 출력
		System.out.println(cuDate.getDayOfMonth()); // 월의 날짜
		System.out.println(cuDate.getDayOfWeek()); // 요일
		System.out.println("===========================");
		System.out.println(cuDate.isLeapYear()); // 윤년인지 확인 (4년에 한번)

		System.out.println("===========================");

		LocalDate target = LocalDate.of(2018, 05, 4);
		// (♥) 지정한 날짜를 날짜형식으로 출력
		System.out.println(target);

		String[] str = target.toString().split("-");
		
		for(String sp:str) {
			System.out.println(sp);
		}
	}
}
