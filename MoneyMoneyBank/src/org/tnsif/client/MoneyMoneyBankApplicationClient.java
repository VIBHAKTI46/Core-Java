//Driver class
//Program to demonstrate on MoneyMoneyBank App
package org.tnsif.client;

import org.tnsif.application.MMBankFactory;
import org.tnsif.application.MMCurrentAcc;
import org.tnsif.application.MMSavingAcc;
import org.tnsif.framework.BankFactory;
import org.tnsif.framework.CurrentAcc;
import org.tnsif.framework.savingAcc;

public class MoneyMoneyBankApplicationClient {

	public static void main(String[] args) {
		BankFactory b = new MMBankFactory();
		savingAcc s = new MMSavingAcc(101, "vibhakti Patil", 2000, true);
		CurrentAcc c = new MMCurrentAcc(202, "Ankit Patil", 15000, 10000);
		
		System.out.println(s);
		System.out.println(c);
		
		System.out.println();
		
		System.out.println("Saving Account");
		
		s.withdraw(200);
		
		
		System.out.println("\nCurrent Account");
		c.withdraw(400);
		
		
	}

}