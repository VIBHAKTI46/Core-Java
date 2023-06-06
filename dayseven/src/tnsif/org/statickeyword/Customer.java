//program on static  block static method
package tnsif.org.statickeyword;

public class Customer {
	
	private int cutid;
	private static String campname;
	
	//static block 
	static
	{
		//we canot use non static varible in satic method
		campname = "myntra";
	}

	public Customer() {
		
		System.out.println("default constructor ");
		cutid++;
		
	}

	@Override
	public String toString() {
		return "Customer [cutid=" + cutid + "]";
	}

	static void display ()
	{
		
		System.out.println("campnay name  "+campname);
	}
	
}