package org.java.variable;

public class CastingEx {

	public static void main(String[] args) {
		
	System.out.println("����ȭ");
	
	byte b0=10;
	byte b1=10;
	
	byte b2=(byte)(b0+b1); // byte+byte=(byte)int+int
	// int�� �Ʒ� Ÿ���� �⺻����� �ڵ����� int������ ��ȭ�� �ȴ�.
	int i=b0; // int=int  //���� �� >> ū �� (�ڵ�����ȯ)
	b0=(byte)300; // ū �� >> ���� �� (�ڵ�����ȯ)
			  //���� ����ȯ(���α׷���)
	float f=(float)1.1; // �Ҽ� double
	
	char ch='a'; //char �ƽ�Ű�ڵ�(����, Ư����ȣ�� >> ������ �ٲ� ��)
				//'a'->97, 'A'->65
	int chInt=ch+'b';
	System.out.println(chInt);
	}
}
