//driver class
/*program to demonstrate on MoneyMoneyBank*/
package org.tnsif.client;
import org.tnsif.application.MMCurrentAcc;
import org.tnsif.application.MMSavingAcc;
import org.tnsif.application.MMBankFactory;
import org.tnsif.framework.CurrentAcc;
import org.tnsif.framework.savingAcc;
import org.tnsif.framework.BankFactory;
public class MoneyMoneyBankApplicationClient{
	public static void main(String[] args) {
		BankFactory b = new MMBankFactory();
		savingAcc s = new MMSavingAcc(101, "vibhakti A. Patil", 4000, true);
		CurrentAcc c = new MMCurrentAcc(102, "Ankit A. Patil", 500, 10000);
		System.out.println("Savings Account");
		s.withdraw(s.getAccBal());
		System.out.println("Current Account");
		c.withdraw(s.getAccBal());
		System.out.println(s);
		System.out.println(c);
		
	}
}