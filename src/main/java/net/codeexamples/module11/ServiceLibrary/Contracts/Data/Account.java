package net.codeexamples.module11.ServiceLibrary.Contracts.Data;
/*
 * Listing 1.1
 */
public class Account {

	private int accountId;
	private Customer customer;
	private double balance;
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
