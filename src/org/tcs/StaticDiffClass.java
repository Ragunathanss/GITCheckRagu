package org.tcs;

public class StaticDiffClass extends Static1{

	public static void main(String[] args) {
		
		// without extends
		Static1.m1();  // classname .method name	
		System.out.println(Static1.b);
		
		//with extends
		m1();
		System.out.println(b);
		
		
	}
	
	
}
