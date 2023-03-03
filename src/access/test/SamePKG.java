package access.test;

public class SamePKG {// access static variable into non static method

	// conflict added 1st time
	// RaguBranch 
	static int a=20;
	
	public  void m4() {  
System.out.println(a);
	}
	
	public void m5() {

	}

	public static void main(String[] args) { // if we remove static it approves, have to check
		
		SamePKG s = new SamePKG();
		System.out.println(a); // static variable so can be called directly
		
	}	
	
}

