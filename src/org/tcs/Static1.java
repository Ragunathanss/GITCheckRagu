package org.tcs;

public class Static1 {
	
	static int a;  // for static we need not declare value it will take default
	static int b=10;
	
	// variable and method both should be in static
	static void m1() {
		System.out.println(a);		

	}
	
	public static void main(String[] args) {
		m1();
		System.out.println(b);
	}
}
