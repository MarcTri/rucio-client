package it.infn.ba.xdc.rucio.client.model;

public class Srm {
	
	private String rse;
	private String domain;
	private boolean _volatile;
	private String type;
	
	public Srm(String rse, String domain, boolean _volatile, String type) {
		
		super();
		this.rse = rse;
		this.domain = domain;
		this._volatile = _volatile;
		this.type = type;
		
	}
	
	public Srm() {
		super();
	}

	public String getRse() {
		return rse;
	}

	public void setRse(String rse) {
		this.rse = rse;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public boolean get_volatile() {
		return _volatile;
	}

	public void set_volatile(boolean _volatile) {
		this._volatile = _volatile;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "{'rse': " + this.rse + "," + " 'domain': " + this.domain + ","
				+ " 'volatile': " + this._volatile + "," + " 'type': " + this.type + "}";
	}

}
