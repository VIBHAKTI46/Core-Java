//static variable program
package tnsif.org.statickeyword;

public class Employee {
	//non static data member
	private int empid;
	private String empname ;
	
	//static data member
	static String campanyname ="TNS india";

	public Employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}
	

}