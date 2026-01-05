package JAVACODING;

public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1="TEHSJAHSSSDETT";
		char[] Ch=S1.toCharArray();
		for(int i=0;i<Ch.length;i++) {
			int count=0;
			for(int j=0;j<Ch.length;j++) {
				if(Ch[i]==Ch[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(Ch[i]);
			}
		}

	}

}
