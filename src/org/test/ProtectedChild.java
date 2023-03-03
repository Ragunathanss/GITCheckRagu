package org.test;

public class ProtectedChild extends ProtectedParent { // child1
	
	public static void main(String[] args) {
		
		// without extends
		ProtectedParent pp = new ProtectedParent();
		pp.m2();
		pp.m1();
		
		
		// with extends keyword
		ProtectedChild p1 = new ProtectedChild();
		p1.m1();
		p1.m2();
		
	}

}
