package org.tnsif.application;
import org.tnsif.framework.CurrentAcc;
import org.tnsif.framework.savingAcc;
import org.tnsif.framework.BankFactory;
public class MMBankFactory extends BankFactory{

	@Override
	public savingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc s = new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return s;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc c = new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return c;
	}

	
	
	
}