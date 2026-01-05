package JAVACODING;

public class Occurranceofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="aasseewwee";
		String result="";
		int count=1;
		
		for(int i=0;i<s1.length();i++) {
			if(i<s1.length()-1 && s1.charAt(i)==s1.charAt(i+1)){
				count ++;
			}else {
				result =result+s1.charAt(i)+count;
				count=1;
			}
		}
		System.out.println(result);

	}

}
