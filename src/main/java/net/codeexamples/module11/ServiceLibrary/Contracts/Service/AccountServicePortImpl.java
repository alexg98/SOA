package net.codeexamples.module11.ServiceLibrary.Contracts.Service;

import javax.xml.ws.Endpoint;

public class AccountServicePortImpl {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/hello", new AccountService());
	}

}
