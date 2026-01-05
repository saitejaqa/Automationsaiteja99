package JAVACODING;

public class Nestedloops {

	public static void main(String[] args) {
		//int n=1;
		//int n=1;
		for(int i=1;i<5;i++) {
			
			for(int j=1;j<=i;j++)
			{
				System.out.print((i+j)*3);
				//i++;

			}
			System.out.println();
		}
	}
}
