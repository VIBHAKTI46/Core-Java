package org.tnsif.application;
import org.tnsif.framework.savingAcc;
public class MMSavingAcc extends savingAcc{
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
	}

	@Override
	public String toString() {
		return  super.toString() + "]";
	}

	
}
