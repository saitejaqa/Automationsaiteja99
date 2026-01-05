package JAVACODING;

public class HyderabadtrafficInterface implements CentralTeafficInterface {

	public static void main(String[] args) {
		CentralTeafficInterface ct=new HyderabadtrafficInterface();
		ct.greenlight();
		ct.redlight();
		ct.yellowlight();
	}
	@Override
	public void greenlight() {
		System.out.println("green light");
	}
	@Override
	public void redlight() {
		System.out.println("redlight");
	}

	@Override
	public void yellowlight() {
		System.out.println("yellow light");
	}
}
