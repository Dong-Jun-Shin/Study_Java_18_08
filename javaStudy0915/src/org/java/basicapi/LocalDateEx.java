package org.java.basicapi;

import java.time.LocalDate;

public class LocalDateEx {

	public static void main(String[] args) {

		LocalDate cuDate = LocalDate.now(); // ���� �����, ��¥ ������

		System.out.println(cuDate);
		System.out.println("===========================");

		// System.out.println(cuDate.get-); // getYear(), getMonth()...
		System.out.println(cuDate.getYear()); // ��
		System.out.println(cuDate.getDayOfYear()); // ���� ��¥
		System.out.println(cuDate.getMonth()); // ��
		// GregorianCalendar�� +1�� ��������, LocalDate�� getMonth�� �׳� ���
		System.out.println(cuDate.getDayOfMonth()); // ���� ��¥
		System.out.println(cuDate.getDayOfWeek()); // ����
		System.out.println("===========================");
		System.out.println(cuDate.isLeapYear()); // �������� Ȯ�� (4�⿡ �ѹ�)

		System.out.println("===========================");

		LocalDate target = LocalDate.of(2018, 05, 4);
		// (��) ������ ��¥�� ��¥�������� ���
		System.out.println(target);

		String[] str = target.toString().split("-");
		
		for(String sp:str) {
			System.out.println(sp);
		}
	}
}
