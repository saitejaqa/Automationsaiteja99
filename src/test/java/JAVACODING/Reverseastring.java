package JAVACODING;

public class Reverseastring {

	public static void main(String[] args) {
		String S1="METROLINX";
		int length=S1.length();
		String rev="";
		for (int i=length-1;i>=0;i--) {
			rev=rev+S1.charAt(i);
		}
		System.out.println("Reversed String is :" +rev);
	}
}
