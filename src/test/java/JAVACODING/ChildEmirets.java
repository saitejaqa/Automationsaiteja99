package JAVACODING;

public class ChildEmirets extends ParentAirCraft {

	public static void main(String[] args) {
		ChildEmirets CE=new ChildEmirets();
		CE.saftyguidelines();
		CE.engine();
		CE.bodycolor();
	}
	@Override
	public void bodycolor() {
		
		System.out.println("Red color on the body");
	}
}
