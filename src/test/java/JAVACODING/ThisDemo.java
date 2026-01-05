package JAVACODING;

public class ThisDemo {
	
	int a=3;
	
	public void getdata()
	{
		int a=4;
		int b=a+this.a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);//this brings value from global level.
		//this refer to current object and object lies in class level.
	}
	public static void main(String[] args) {
		ThisDemo TD=new ThisDemo();
		TD.getdata();			
	}
}
