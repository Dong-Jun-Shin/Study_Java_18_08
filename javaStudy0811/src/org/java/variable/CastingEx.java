package org.java.variable;

public class CastingEx {

	public static void main(String[] args) {
		
	System.out.println("형변화");
	
	byte b0=10;
	byte b1=10;
	
	byte b2=(byte)(b0+b1); // byte+byte=(byte)int+int
	// int형 아래 타입은 기본연산시 자동으로 int형으로 변화가 된다.
	int i=b0; // int=int  //작은 형 >> 큰 형 (자동형변환)
	b0=(byte)300; // 큰 형 >> 작은 형 (자동형변환)
			  //강제 형변환(프로그래머)
	float f=(float)1.1; // 소수 double
	
	char ch='a'; //char 아스키코드(영어, 특수기호를 >> 정수로 바꾼 것)
				//'a'->97, 'A'->65
	int chInt=ch+'b';
	System.out.println(chInt);
	}
}
