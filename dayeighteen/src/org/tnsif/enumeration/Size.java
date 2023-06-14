package org.tnsif.enumeration;

public enum Size implements Pizza {
	SMALL ,MEDIUM ,LARGE;

	@Override
	public void displaysize() {
		System.out.println("size :"+this);
		
	}

}