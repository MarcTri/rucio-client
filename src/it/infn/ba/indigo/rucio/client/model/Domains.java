package it.infn.ba.indigo.rucio.client.model;

public class Domains {
	
	private Wan wan;
	private Lan lan;
	
	public Domains(Wan wan, Lan lan) {
		
		super();
		this.wan = wan;
		this.lan = lan;
		
	}

	public Domains() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Wan getWan() {
		return wan;
	}

	public void setWan(Wan wan) {
		this.wan = wan;
	}

	public Lan getLan() {
		return lan;
	}

	public void setLan(Lan lan) {
		this.lan = lan;
	}
	
	@Override
	public String toString() {
		return "{'wan': " + this.wan + "," + " 'lan': " + this.lan + "}";
	}
	

}
