package it.infn.ba.indigo.rucio.client.utils;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class Auth_userpass {
	
	private static final String account  = Properties_rucio.get_properties()
														   .getProperty("account");
	
	private static final String username = Properties_rucio.get_properties()
														   .getProperty("username");
	
	private static final String password = Properties_rucio.get_properties()
														   .getProperty("password");
	
	private static String token = null;
	
	public static String get_token(Client client, String REST_URI) {
		
		WebTarget webTarget = client.target(REST_URI).path("/auth/userpass");
		
		Response response = webTarget.request()
									 .header("X-Rucio-Account", account)
									 .header("X-Rucio-Username", username)
									 .header("X-Rucio-Password", password)
									 .get();
		
		if (response.getStatus() == 200) {
				token = response.getHeaderString("X-Rucio-Auth-Token");
		}
		
		return token;
		
	}

}
