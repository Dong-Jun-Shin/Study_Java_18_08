package org.java.basicapi;

public class WrapperEx0 {
	public static void main(String[] args) {

		System.out.println("�ڹ��� �⺻ Ÿ��(primitive type");

		byte b = 10;
		short s = 10;
		int i = 10;
		long l = 10;
		float f = 1.1f;
		double d = 1.1;
		char ch = 'a';
		boolean bool = false;

		// �⺻Ÿ�� ���� ���� '='���� ����
		// ������ Ÿ�� new �����ڷ� ������ ��ü�� �ְ����� ����

		// �⺻ Ÿ�� -> ��üȭ (Boxing)
		Byte b1 = new Byte(b);
		Short s1 = new Short(s);
		Integer i1 = new Integer(i);
		Long l1 = new Long(l);
		Float f1 = new Float(f);
		Double d1 = new Double(d);
		Character ch1 = new Character(ch);
		Boolean bool1 = new Boolean(bool);

		// ������(��ü) -> �⺻ Ÿ��ȭ (UnBoxing)
		byte b2 = b1.byteValue();
		short s2 = s1.shortValue();
		int i2 = i1.intValue();
		long l2 = l1.longValue();
		float f2 = f1.floatValue();
		double d2 = d1.doubleValue();
		char ch2 = ch1.charValue();
		boolean bool2 = bool1.booleanValue();

	}
}