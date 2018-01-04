package net.codeexamples.module11.ServiceLibrary.Contracts.Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import net.codeexamples.module11.ServiceLibrary.Contracts.Data.Account;
import net.codeexamples.module11.ServiceLibrary.Contracts.Data.Customer;
/*
 * Listing 1.3
 */
@WebService
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL) // optional
public interface IAccountService {
	
	@WebMethod 
	int createAccount(@WebParam Customer customer) throws Exception;
	
	@WebMethod 
	boolean debitAccount(@WebParam int accountId, @WebParam double amount) throws Exception;
	
	@WebMethod 
	boolean creditAccount(@WebParam int accountId, @WebParam double amount) throws Exception;
	
	@WebMethod
	Account getAccountByCustomerId(@WebParam int customerId) throws Exception;
}
