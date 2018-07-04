package it.infn.ba.indigo.rucio.client.model;

public class Files {
	
	private String scope;
	private String name;
	private int bytes;
	private String adler32;
	private String pfn;
	
	public Files(String scope, String name, int bytes, String adler32, String pfn) {
		
		super();
		this.scope = scope;
		this.name = name;
		this.bytes = bytes;
		this.adler32 = adler32;
		this.pfn = pfn;
		
	}

	public Files() {
		// TODO Auto-generated constructor stub
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

	public int getBytes() {
		return bytes;
	}

	public void setBytes(int bytes) {
		this.bytes = bytes;
	}

	public String getAdler32() {
		return adler32;
	}

	public void setAdler32(String adler32) {
		this.adler32 = adler32;
	}

	public String getPfn() {
		return pfn;
	}

	public void setPfn(String pfn) {
		this.pfn = pfn;
	}
	
	@Override
	public String toString() {
		return "{'scope': " + this.scope + "," + " 'name': " + this.name + 
				"," + " 'bytes': " + this.bytes + "," + " 'adler32': " + this.adler32
				+ "," + " 'pnf': " + this.pfn + "}";
	}

}
