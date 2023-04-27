package org.tnsif.interfacedemo;

public class ReceipeImplementable implements Receipe {
private String name;
//getter and Setter

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public String displayName() {
	return "Welcome to "+name;
}
}
