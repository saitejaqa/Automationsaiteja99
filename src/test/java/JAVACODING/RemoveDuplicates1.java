package JAVACODING;

public class RemoveDuplicates1 {

	public static void main(String[] args) {
		String s1="SSSSSS";
		char[] ch=s1.toCharArray();
		for(int i=0;i<=s1.length();i++) {
			for(int j=i+1;j<=s1.length();j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[i]);
					break;
				}
			}
		}

	}
}
