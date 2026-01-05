package JAVACODING;

public class UniqueNumber {

	public static void main(String[] args) {

		int a[] = { 1, 3, 3, 3, 4, 5, 5, 6, 7, 1 };

		//ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count==1) {
				//boolean c=list.add(a[i]);
				System.out.println("unique number is: "+ a[i]);
			}
		}
	}
}