package JAVACODING;

public class ReverseaStringpreservingwhitespace {

	public static void main(String[] args) {
	   String S1="I am learning Java Code";
	   String[] Words=S1.split(" ");
	   String reversString="";
	   for(String W:Words) {
		   String reverseword="";
		   for(int i=W.length()-1;i>=0;i--)
		   {
			   
			   reverseword=reverseword+W.charAt(i);
		   }
		   reversString=reversString+reverseword+" ";
	   }
	   System.out.println(reversString);
	}
}
