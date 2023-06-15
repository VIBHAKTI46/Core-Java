package org.tnsif.framework;

public abstract class CurrentAcc extends BankAcc{
	private final float creditLimit;
	//constructor
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	public void withdraw(float accBal) {
		System.out.println("Account No: " + this.getAccNo() + " Account Name: " + this.getAccNm() + " Account Balance: " + (this.getAccBal()+ creditLimit));
	}
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	
}
