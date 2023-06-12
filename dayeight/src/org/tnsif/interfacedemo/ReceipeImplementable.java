//functional interface
package org.tnsif.interfacedemo;

public class ReceipeImplementable implements Receipe {

	private String name;
	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String displayname() {
		
		return "welcomr to"+name;
	}
	

}