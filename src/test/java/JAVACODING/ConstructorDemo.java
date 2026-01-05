package JAVACODING;

public class ConstructorDemo {
	
	String s="SAITEJA";

	public static void main(String[] args) {
		
		ConstructorDemo Cd = new ConstructorDemo();
		ConstructorDemo Cd1 = new ConstructorDemo(2,3);
		ConstructorDemo Cd2 = new ConstructorDemo("SAITEJA");
		ConstructorDemo Cd3 = new ConstructorDemo("TEJA");
	}
	public ConstructorDemo() {
		System.out.println("Default Constructor");
	}
	public ConstructorDemo(int a, int b) {
		System.out.println("Parameter Constructor");
	}
	public ConstructorDemo(String S) {
		System.out.println("String Constructor");
	}

}

// Constructor class name should always be same when we create Constructor
//No return type for constructor
