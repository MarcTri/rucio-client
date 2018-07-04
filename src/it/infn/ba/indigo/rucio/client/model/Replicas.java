package it.infn.ba.indigo.rucio.client.model;

import java.util.List;
import java.util.Map;

public class Replicas {
	
	private Map<String, String> states;
	private Map<String, Srm> pfns;
	private String adler32;
	private String name;
	private Map<String, List<String>> rses; 
	private String scope;
	private int bytes;
	private String md5;
	
	public Replicas(Map<String, String> states, Map<String, Srm> pfns, String adler32, String name,
					Map<String, List<String>> rses, String scope, int bytes, String md5) {
		
		super();
		this.states = states;
		this.pfns = pfns;
		this.adler32 = adler32;
		this.name = name;
		this.rses = rses;
		this.scope = scope;
		this.bytes = bytes;
		this.md5 = md5;
	}
	
	public Replicas() {
		super();
	}
	
	public Map<String, String> getStates() {
		return states;
	}

	public void setStates(Map<String, String> states) {
		this.states = states;
	}
	
	public Map<String, Srm> getPfns() {
		return pfns;
	}
	
	public void setPfns(Map<String, Srm> pfns) {
		this.pfns = pfns;
	}
	
	public String getAdler32() {
		return adler32;
	}

	public void setAdler32(String adler32) {
		this.adler32 = adler32;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Map<String, List<String>> getRses() {
		return rses;
	}
	
	public void setRses(Map<String, List<String>> rses) {
		this.rses = rses;
	}
	
	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public int getBytes() {
		return bytes;
	}

	public void setBytes(int bytes) {
		this.bytes = bytes;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}
	
	@Override
	public String toString() {
		return "{'states': " + this.states + "," + " 'pfns': " + this.pfns + "," + " 'adler32': " + this.adler32 
				+ "," + " 'name': " + this.name + "," + " 'rses': " + this.rses + "," + " 'scope': " + this.scope 
				+ "," + " 'bytes': " + this.bytes + "," + " 'md5': " + this.md5 + "}";
	}
	
	
	
}
