package org.java.operator;

public class OperatorEx16 {

	public static void main(String[] args) {
		System.out.println("삼항 연산자");
		int num=10;
		
		int result=num>10?1:0;
		
		System.out.println(result);
		//------------------------------------------같다
		if(num>10) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}
}
