package it.infn.ba.indigo.rucio.client.model;

import java.util.Map;

public class Protocols {
	
	private Map<String, String> extended_attributes;
	private String hostname;
	private String prefix;
	private Domains domains;
	private String scheme;
	private int port;
	private String impl;
	
	public Protocols(Map<String, String> extended_attributes, String hostname, String prefix,
					Domains domains, String scheme, int port, String impl) {
		
		super();
		this.extended_attributes = extended_attributes;
		this.hostname = hostname;
		this.prefix = prefix;
		this.domains = domains;
		this.scheme = scheme;
		this.port = port;
		this.impl = impl;
		
	}

	public Protocols() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Map<String, String> getExtended_attributes() {
		return extended_attributes;
	}

	public void setExtended_attributes(Map<String, String> extended_attributes) {
		this.extended_attributes = extended_attributes;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public Domains getDomains() {
		return domains;
	}

	public void setDomains(Domains domains) {
		this.domains = domains;
	}

	public String getScheme() {
		return scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getImpl() {
		return impl;
	}

	public void setImpl(String impl) {
		this.impl = impl;
	}
	
	@Override
	public String toString() {
		return "{'extended_attributes': " + this.extended_attributes + "," + " 'hostname': " + this.hostname + "," +
				" 'prefix': " + this.prefix + "," + " 'domains': " + this.domains + "," + 
				" 'scheme': " + this.scheme + "," + " 'port': " + this.port + "," +
				" 'impl': " + this.impl + "}";
	}
	

}
