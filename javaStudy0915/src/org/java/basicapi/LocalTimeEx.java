package org.java.basicapi;

import java.time.LocalTime;

public class LocalTimeEx {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();

		System.out.println(now);
		// 현재 시간정보만 (HH:MM:SS.NNN), 초 밑의 시간까지 표시

		System.out.println(now.getHour()); // 시
		System.out.println(now.getMinute()); // 분
		System.out.println(now.getSecond()); // 초
		System.out.println(now.getNano()); // 밀리초

		LocalTime tarTime = LocalTime.of(11, 10, 22);
		System.out.println(tarTime);
	}
}
