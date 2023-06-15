package org.tnsif.framework;
public abstract class BankFactory {
	abstract public savingAcc getNewSavingAcc(int accNo, String accNm, float accBal, 
			boolean isSalaried);
	abstract public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, 
			float creditLimit);
	
}
