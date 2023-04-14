package org.tnsif.singleinheritance;
//every inhertance is IS A relationship 
//child class 
public class Student extends Citizen {

	private String college ;
	private int rollno ;
	
	//default construstor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parametrized construtor 
	public Student(String name, String adharno, String city, long contactno,String college, int rollno) {
		super(name, adharno, city, contactno);
		this.college = college;
		this.rollno = rollno;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [college=" + college + ", rollno=" + rollno + ", getName()=" + getName() + ", getAdharno()="
				+ getAdharno() + ", getCity()=" + getCity() + ", getContactno()=" + getContactno() +  "]";
	}
	
	
	
	
	

	}

