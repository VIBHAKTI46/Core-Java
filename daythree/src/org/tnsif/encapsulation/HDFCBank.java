//program to demonstrate Encapsulation
package org.tnsif.encapsulation;

public class HDFCBank {

//private data members
		private Long cardno;
		private String cardtype;
		private int cvvno;
		private int pinno;
		//getter and setter
		public Long getCardno() {
			return cardno;
		}
		public void setCardno(Long cardno) {
			this.cardno = cardno;
		}
		public String getCardtype() {
			return cardtype;
		}
		public void setCardtype(String cardtype) {
			this.cardtype = cardtype;
		}
		
		public int getCvvno() {
			return cvvno;
		}
		public void setCvvno(int cvvno) {
			this.cvvno = cvvno;
		}
		public int getPinno() {
			return pinno;
		}
		public void setPinno(int pinno) {
			this.pinno = pinno;
		}
		@Override
		public String toString() {
			return "HDFCBank [cardno=" + cardno + ", cardtype=" + cardtype + ", cvvno=" + cvvno + ", pinno=" + pinno
					+ "]";
		}
		
		

	

}