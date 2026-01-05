package JAVACODING;

public class largestnumberinanarray {

	public static void main(String[] args) {
	int[] array= {12,56,765,9890};
	int max=array[0]; //assuming that in the above array in first element is largest
	for(int i=1;i<array.length;i++) {
		if(array[i]<max) {
			max=array[i];
		}
	}
	System.out.println("The largest number is :" +max);
	}

}
