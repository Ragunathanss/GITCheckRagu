package access.test;

public class Stat {// access static variable into static method
	
	
	static int b;
	
	public static  void m1() {
System.out.println(b);
	}
	
	public static void main(String[] args) {
		m1();
	}
}
// o/p - ascessable