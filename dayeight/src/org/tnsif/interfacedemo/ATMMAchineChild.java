package org.tnsif.interfacedemo;

public class ATMMAchineChild implements ATMMachine {
public void withdraw() {
	System.out.println("withdraw amount:"+amountwith);
	
}
public void deposit() {
	System.out.println("deposite amount  :-"+amountdepo);
}
}
