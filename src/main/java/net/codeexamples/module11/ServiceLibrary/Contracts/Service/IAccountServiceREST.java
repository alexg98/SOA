package net.codeexamples.module11.ServiceLibrary.Contracts.Service;

import net.codeexamples.module11.ServiceLibrary.Contracts.Data.Account;
import net.codeexamples.module11.ServiceLibrary.Contracts.Data.Customer;
/*
 * Listing 1.7
 */
public interface IAccountServiceREST {
	
	int createAccount(Customer customer) throws Exception;
	
	boolean debitAccount(int accountId, double amount) throws Exception;
	
	boolean creditAccount(int accountId, double amount) throws Exception;
	
	Account getAccountByCustomerId(int customerId) throws Exception;
}
