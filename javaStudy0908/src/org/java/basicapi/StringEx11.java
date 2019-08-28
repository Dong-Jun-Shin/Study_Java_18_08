package org.java.basicapi;

public class StringEx11 {

	public static void main(String[] args) {

		//String 클래스, 모두 같은 값
		String str1 = "java"; // 타입 마냥 사용하는 스트링 리터럴
		String str2 = "java";
		String str3 = new String("java");
		String str4 = new String("java");
		
		// .equals()는 문자를 비교, ==은 공간까지 모두 비교
		System.out.println(str1==str2); //true 같음
		System.out.println(str1.equals(str2)); //true 같음
		System.out.println(str3==str4); //false 다름
		   //new는 새 공간을 만들어 각각 저장하는 별개의 공간을 만들어준다.
	    System.out.println(str3.equals(str4)); //true 같음
	    System.out.println(str1==str3); //false 다름
	    System.out.println(str1.equals(str3)); //true 같음
	    
	    //String 수정 불가능, 하지만 합치는건 가능
	    String s1="java";
	    String s2="project";
	    
	    String s3=s1.concat(s2); // 두 문자열을 합한다.
	    System.out.println(s3);
	    System.out.println(s1);
	    
	    System.out.println("=======================");
	    
	    String s4="abcd";	    
	    String str0 = "java Project";
	    
	    System.out.println(str0.charAt(3)); //index의 값 return
	    	//n번째 문자를 추출, 0부터 시작, 띄어쓰기 포함
	    System.out.println(s4.compareTo(str0)); //사전 검색 순서
	    	//두 문자열을 비교하여, 사전적 앞이면 '-'를 return, 같으면 '0', 뒤면 '+'
	    System.out.println(str0.contains("java")); // 문자를 검색
	    	//참, 거짓으로 출력
	    System.out.println(str0.length()); //문자열 길이(공백 포함)
	    
	    
	    System.out.println(str0.replace("java", "JSP")); 
	    System.out.println(str0);
	    	//기준 문자열을 특정문자열로 변환 
	    	//*저장하는게 아니라* 대체하고 출력만 한다. (기존꺼 변경X)
	    
	    String phone="010-0000-0000";
	    String[] strArr = phone.split("-"); //return이 *String 배열*로 나온다.
	    // split(구분기호) -> **배열로 잘라서 저장 (String [])
	    
	    //forEach문 배열을 이용가능 (출력...등등)
	    for(String arr:strArr) {
	    	System.out.println(arr);
	    }
	    //일반 for문
	    for(int i=0; i<strArr.length; i++) {
	    	System.out.println(strArr[i]);
	    }
	}
}
