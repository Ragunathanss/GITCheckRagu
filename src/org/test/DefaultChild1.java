package org.test;

public class DefaultChild1 extends DefaultParent{ // child

	public static void main(String[] args) {
		
		// without extends keyword just make object from parent class name
		DefaultParent d1 = new DefaultParent();
		d1.m1();
		d1.m2();
		
		System.out.println("      ");
		//with extends keyword make obj from child class name 
		DefaultChild1 d2 = new DefaultChild1();
		d2.m1();
		d2.m2();
	}	
}
