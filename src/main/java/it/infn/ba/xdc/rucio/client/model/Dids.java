package it.infn.ba.xdc.rucio.client.model;

public class Dids {
	
	private String scope;
	private String name;
	
	public Dids(String scope, String name) {
		
		super();
		this.scope = scope;
		this.name = name;
		
	}

	public Dids() {
		super();
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "{'scope': " + this.scope + "," + " 'name': " + this.name + "}";
	}

}
