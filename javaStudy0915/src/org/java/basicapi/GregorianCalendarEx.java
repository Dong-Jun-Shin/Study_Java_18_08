package org.java.basicapi;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarEx {

	public static void main(String[] args) {
		
		//�߻�Ŭ���� Calendar�� ����
		GregorianCalendar g1 = new GregorianCalendar();
		
		System.out.print(g1.get(Calendar.YEAR)+"�� "); //��
		System.out.print(g1.get(Calendar.MONTH)+1+"�� "); //��
		System.out.print(g1.get(Calendar.DATE)+"�� "); //��
		System.out.print(g1.get(Calendar.HOUR)+"�� "); //��
		System.out.print(g1.get(Calendar.MINUTE)+"�� "); //��
		System.out.println(g1.get(Calendar.SECOND)+"��"); //��
	}
}
