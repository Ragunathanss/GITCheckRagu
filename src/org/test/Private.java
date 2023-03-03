package org.test;

public class Private {
	
	private int a =10;
	
	 private void m1() {
     int b = 20;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		Private s = new Private();
		
		s.m1();
		}
	
}
