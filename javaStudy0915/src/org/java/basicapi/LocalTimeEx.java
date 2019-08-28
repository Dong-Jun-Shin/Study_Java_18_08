package org.java.basicapi;

import java.time.LocalTime;

public class LocalTimeEx {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();

		System.out.println(now);
		// ���� �ð������� (HH:MM:SS.NNN), �� ���� �ð����� ǥ��

		System.out.println(now.getHour()); // ��
		System.out.println(now.getMinute()); // ��
		System.out.println(now.getSecond()); // ��
		System.out.println(now.getNano()); // �и���

		LocalTime tarTime = LocalTime.of(11, 10, 22);
		System.out.println(tarTime);
	}
}
