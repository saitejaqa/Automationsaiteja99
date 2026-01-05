package JAVACODING;

public class Duplicates {

	public static void main(String[] args) {
		String S1="SAIITEJAA";
		char[] ch=S1.toCharArray();
		for (int i=0;i<=S1.length();i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]){
					System.out.println(ch[i]);
				}
			}
		}
	}
}
