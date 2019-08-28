package org.java.collection;

class GenericSub<T>{
	T num;
	
	public void setNum(T num) {
		this.num = num;
	}
	
	public T getNum() {
		return num;
	}
}

public class GenericEx2 {

	public static void main(String[] args) {
		
		GenericSub<String> g1 = new GenericSub();
		g1.setNum("m1");
		g1.getNum();
		
		GenericSub<Integer> g2 = new GenericSub();
		g2.setNum(100);
		g2.getNum();
	}
}

