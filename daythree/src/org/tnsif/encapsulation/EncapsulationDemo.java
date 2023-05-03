package org.tnsif.encapsulation;

public class EncapsulationDemo {
	public static void main(String[] args) {
		HDFCBank h =new HDFCBank();
		//setter
		h.setCardno(451266542L);
		h.setCardtype("Credit");
		h.setCvvno(4444);
		h.setPinno(1001);
		//getter is used to return value
		System.out.println(h.getCardno());
		System.out.println(h.getCardtype());
		System.out.println(h.getCvvno());
		System.out.println(h.getPinno());
		

	}

}