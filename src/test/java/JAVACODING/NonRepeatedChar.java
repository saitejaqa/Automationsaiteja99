package JAVACODING;
public class NonRepeatedChar {
	public static void main(String[] args) {
		String S1="SSSSSSA";
		for(int i=0;i<S1.length();i++) {
		char currentChar=S1.charAt(i);
		int count=0;
		for(int j=0;j<S1.length();j++) {
			if(S1.charAt(j)==currentChar) {
				count++;
			}
		}
		 if (count == 1) {
             System.out.println(currentChar + " is a non-repeated character");
		}
	}
	}
}
	