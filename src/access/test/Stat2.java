package access.test;

public class Stat2 {// access static method into non static method
	
	static int c=20;
	
	 static void m9() {
		 int b;
System.out.println(c);
	}

	public static void main(String[] args) {
		m9();
	}
}
//