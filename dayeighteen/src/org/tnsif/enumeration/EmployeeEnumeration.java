package org.tnsif.enumeration;

public class EmployeeEnumeration {
	
	enum Emptype
	{
		CONTRACAT,PERMENANT,PARTTIME
	}
	
	static void print(Emptype a)
	{
		if (a==Emptype.CONTRACAT)
		{
			System.out.println("You are contact based emp");
		}
		else if (a==Emptype.PERMENANT)
		{
			System.out.println("You are perment based emp");
		}
		
		else
		{
			System.out.println("You are part time  based emp");
		}
	}

	public static void main(String[] args) {
		Emptype  e=Emptype .PERMENANT;
		print(e);

	}

}