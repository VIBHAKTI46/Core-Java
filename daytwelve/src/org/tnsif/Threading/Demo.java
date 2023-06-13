package org.tnsif.Threading;

public class Demo {

	public static void main(String[] args) {
		/*person p =new person();
		p.setId(101);
		p.setName("vibhakti");
		Childthread  t1 =new Childthread(p);
		Childthread  t2 =new Childthread(p);
		*/
		Account account =new Account();
		account.setId(101);
		account.setName("sak");
		account.setBalance(500000);
		
		AccountThread t1 =new AccountThread(account,120000);
		AccountThread t2 =new AccountThread(account,110000);
		AccountThread t3 =new AccountThread(account,100000);
		AccountThread t4 =new AccountThread(account,90000);
		AccountThread t5 =new AccountThread(account,80000);
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(account);

	}

}
