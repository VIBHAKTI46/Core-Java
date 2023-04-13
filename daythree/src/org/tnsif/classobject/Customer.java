//program on demostrate on class object constructor 
package org.tnsif.classobject;
public class Customer {
	//private data member 
	private int cunstomerid ;
	private String customername ;
	private String city ;
	
	//constructor does not have any return type
	//it is same as classname follwed by '()'
	//default constructor 
	public Customer() {
		super();
		
	}
	
	//parametrized constructor 
	public Customer(int cunstomerid, String customername, String city) {
		super();
		this.cunstomerid = cunstomerid;
		this.customername = customername;
		this.city = city;
	}
	
	

	/* 
	 * to access all the private data member into another class
	 * then use getter and setter 
	 */
	//setter and getter method
	public int getCunstomerid() {
		return cunstomerid;
	}

	public void setCunstomerid(int cunstomerid) {
		this.cunstomerid = cunstomerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	//object of a class will call
	@Override
	public String toString() {
		return "Customer [cunstomerid=" + cunstomerid + ", customername=" + customername + ", city=" + city + "]";
	}
	
	
	
	

}