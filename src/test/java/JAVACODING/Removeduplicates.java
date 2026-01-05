package JAVACODING;

public class Removeduplicates {

	public static void main(String[] args) {
		String S1="SSSSSS";
		char[] ch=S1.toCharArray();
		for(int i=0;i<S1.length();i++) {
			for(int j=i+1;j<S1.length();j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[i]);
					break;
				}				
			}
		}
	}
}
