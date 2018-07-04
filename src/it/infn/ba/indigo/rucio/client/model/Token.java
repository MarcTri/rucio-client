package it.infn.ba.indigo.rucio.client.model;

public class Token {
	
	private String lifetime;
	private String account;
	private String identity;
	
	public Token(String lifetime, String account, String identity) {
		
		super();
		this.lifetime = lifetime;
		this.account = account;
		this.identity = identity;
		
	}

	public Token() {
		// TODO Auto-generated constructor stub
	}

	public String getLifetime() {
		return lifetime;
	}

	public void setLifetime(String lifetime) {
		this.lifetime = lifetime;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}
	
	@Override
	public String toString() {
		return "{'lifetime': " + this.lifetime + "," + " 'account': " + this.account + ","
				+ " 'identity': " + this.identity + "}";
	}

}
