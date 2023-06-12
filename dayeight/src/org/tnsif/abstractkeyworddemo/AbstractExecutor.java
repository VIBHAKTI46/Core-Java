package org.tnsif.abstractkeyworddemo;

public class AbstractExecutor {
public static void main(String args) {
	
	RemoteChild r =new RemoteChild();
	r.name = "durocell";
	r.display();
	r.functionremote();
	r.create();
}
}
