package org.test;

public class DefaultParent {
	
	int a= 30;
	int b = 40;
	
	 void m1() {
System.out.println(a);
	}

	 void m2() {

		System.out.println(b);
	}
	
	public static void main(String[] args) {
	DefaultParent d = new DefaultParent();
	d.m1();
	d.m2();
	
	
}}
