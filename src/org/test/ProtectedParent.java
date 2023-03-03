package org.test;

public class ProtectedParent {// parent
	
	
	protected void m1() {
		int a=10;
System.out.println(a);
		
	}
	
	protected void m2() {
		int b = 60;
System.out.println(b);
	}

	
	public static void main(String[] args) {
		ProtectedParent p = new ProtectedParent();
		p.m1();
		p.m2();
	}
}
