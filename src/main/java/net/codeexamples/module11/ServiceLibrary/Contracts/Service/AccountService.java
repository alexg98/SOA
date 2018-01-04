package net.codeexamples.module11.ServiceLibrary.Contracts.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.jws.WebService;

import net.codeexamples.module11.ServiceLibrary.Contracts.Data.Account;
import net.codeexamples.module11.ServiceLibrary.Contracts.Data.Customer;
/*
 * Listing 1.4
 */
@WebService(endpointInterface = "net.codeexamples.module11.ServiceLibrary.Contracts.Service.IAccountService")
public class AccountService implements IAccountService {
	List<Account> _accounts = new LinkedList<Account>();
	
	public int createAccount(Customer customer) throws Exception {
		Account account = new Account();
		account.setCustomer(customer);
		account.setBalance(0);
		account.setAccountId(new Random().nextInt());
		_accounts.add(account);
		return account.getAccountId();
	}

	public boolean debitAccount(int accountId, double amount) throws Exception {
		Account theAccount = _accounts.get(0);
		theAccount.setBalance(theAccount.getBalance() - amount);
		return true;
	}

	public boolean creditAccount(int accountId, double amount) throws Exception {
		Account theAccount = _accounts.get(0);
		theAccount.setBalance(theAccount.getBalance() + amount);
		return true;
	}

	public Account getAccountByCustomerId(int customerId) throws Exception {
		if(_accounts.size() == 0) {
			Customer customer = new Customer();
			customer.setCustomerId(customerId);
			customer.setName("John Doe");
			Account account = new Account();
			account.setAccountId(3456);
			account.setCustomer(customer);
			_accounts.add(account);
		}
		return _accounts.get(0);
	}

}
