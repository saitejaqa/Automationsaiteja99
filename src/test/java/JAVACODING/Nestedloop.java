package JAVACODING;

public class Nestedloop {

	public static void main(String[] args) {
		//int k=1;
		int n=4;
		for(int i=0;i<n;i++)   //four times it will run
		{
			//System.out.println("Outer loop started");
			for(int j=1;j<=n-i;j++) //inner loop
			{
				if(i%2==0) {
				System.out.print("@");
			} 
				else {
					System.out.print("*");
				}
		//System.out.println();
	}
			System.out.println();
}
}
}
