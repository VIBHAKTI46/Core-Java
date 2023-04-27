package org.tnsif.interfacedemo;

public class InterfaceExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ATMMachine al=new ATMMAchineChild();
   al.deposit();
   al.withdraw();
   ReceipeImplementable r=new ReceipeImplementable();
   r.setName("C2TC Program");
   System.out.println(r.displayName());
   
   NestedInterfaceExample n=new NestedInterfaceExample();
   n.setStr1("Nia");
   n.setStr2(" Deshmukh");
   System.out.println(n.concatenate());
	}

}
