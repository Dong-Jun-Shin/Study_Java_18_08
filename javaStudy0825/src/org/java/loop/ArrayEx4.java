package org.java.loop;

public class ArrayEx4 {

	public static void main(String[] args) {
		System.out.println("배열 실습");

		char[] ch = { 'C', 'A', 'F', 'E' };
		String[] binnery = { 
				"0000", "0001", "0010", "0011",  //  0A  1B  2C  3D
				"0100", "0101", "0110", "0111",  //  4E  5F  6G?  7H?
				"1000", "1001", "1010", "1011",  //  8I? 9J? 10A 11B
				"1100", "1101", "1011", "1111",  // 12C 13D 14E 15F
				};

		String result = "";
		// CAFE
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= '0' && ch[i] <= '9') { // 0?, 9?
				result += binnery[ch[i] - '0'];
				// result = result + binnery[ch[i]-'0']   C    A    F   E
			} else {								 //  12   10    5   4
				result += binnery[ch[i] - 'A' + 10]; // 1100 1010 0101 0100
				// result = result + binnery[ch[i]- 'A' + 10]
			}
		}											

		System.out.println("ch= " + new String(ch));
		System.out.println("ch= " + String.valueOf(ch));
		System.out.println(result);
	}
	
	//아무 의미 없으니 나중에 보기
}
