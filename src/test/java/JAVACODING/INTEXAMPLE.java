package JAVACODING;

public class INTEXAMPLE implements Animals,Traffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INTEXAMPLE INT=new INTEXAMPLE();
		INT.getdata();
		
		Animals A=new INTEXAMPLE();
		A.Cow();
		A.Dog();
		A.horse();
		Traffic T=new INTEXAMPLE();
		T.blue();
		T.green();
		T.red();
		

	}

	@Override
	public void red() {
		System.out.println("This is red");
		
	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("This is green");
		
	}

	@Override
	public void blue() {
		// TODO Auto-generated method stub
		System.out.println("This is blue");
		
	}

	@Override
	public void Dog() {
		// TODO Auto-generated method stub
		System.out.println("This is Dog");
		
	}

	@Override
	public void Cow() {
		// TODO Auto-generated method stub
		System.out.println("This is Cow");
		
	}

	@Override
	public void horse() {
		// TODO Auto-generated method stub
		System.out.println("This is horse");
		
	}
	public void getdata() {
		System.out.println("All the data");
	}
	

}
