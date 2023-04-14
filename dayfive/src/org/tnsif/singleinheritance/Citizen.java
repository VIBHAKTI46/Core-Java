//program on single inheritance 
//parent class 
package org.tnsif.singleinheritance;
public class Citizen {

	private String name;
	private String adharno;
	private String city;
	private long contactno;
	//default constructor
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	//paramaterize constructor 
	public Citizen(String name, String adharno, String city, long contactno) {
		super();
		this.name = name;
		this.adharno = adharno;
		this.city = city;
		this.contactno = contactno;
	}
	//geeter and setter 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdharno() {
		return adharno;
	}
	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	//when u print a object they call to string method 
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adharno=" + adharno + ", city=" + city + ", contactno=" + contactno + "]";
	}
	
	
}