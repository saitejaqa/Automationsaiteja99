package JAVACODING;

public class PALINDROME {

	public static void main(String[] args) {
		String S1="MOM0";
		int length=S1.length();
		String rev="";
		//char rev1=S1.charAt(0);
		for(int i=length-1;i>=0;i--) {
			rev=rev+S1.charAt(i);
		}
		if(S1.equals(rev)) {
			System.out.println("Panindrome String :" +S1);
		}else {
			System.out.println("Not an Palindrome String :" +S1);
		}
	}
}
