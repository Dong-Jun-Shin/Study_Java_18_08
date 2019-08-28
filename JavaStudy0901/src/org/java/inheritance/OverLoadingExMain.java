package org.java.inheritance;

public class OverLoadingExMain {

	public static void main(String[] args) {
		OverLoadingEx o1 = new OverLoadingEx();
		o1.overLoadingMethod();
		o1.overloadingMethod(100, "Project");
		o1.overloadingMethod("two Project", 300);

	}
}
