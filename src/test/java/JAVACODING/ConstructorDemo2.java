package JAVACODING;

public class ConstructorDemo2 extends ConstructorDemo {
	
	public ConstructorDemo2() {
		//super();
		System.out.println("Default2 Constructor");
	}
	public ConstructorDemo2(int a, int b) {
		super();
		System.out.println("Parameter Constructor");
	}
	public ConstructorDemo2(String S) {
		System.out.println("String Constructor");
	}


	public static void main(String[] args) {
		ConstructorDemo2 CD2=new ConstructorDemo2();
		ConstructorDemo2 Cd1 = new ConstructorDemo2(1,3);
		
	}

}
