package JAVACODING;

public class StaticVar {
	
	String name;
	String address;
	//String City;
	static String City="BGR";
	static int i=0;
	
	public StaticVar(String name,String address) 
	{
		this.name=name;
		this.address=address;
		i++;
		System.out.println(i);
		//this.City=City;
	}
	public void getaddress() 
	{
		System.out.println(address);
	}
	public static void main(String[] args) {
		
		StaticVar SV = new StaticVar("SAI", "HYD");
		StaticVar sv = new StaticVar("TEJ", "BGR");
		SV.getaddress();
		sv.getaddress();
	}
}
