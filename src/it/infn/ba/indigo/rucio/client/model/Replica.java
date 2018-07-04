package it.infn.ba.indigo.rucio.client.model;

import java.util.List;

public class Replica {
	
	private String rse;
	private List<Files> files;
	private boolean ignore_availability;
	
	public Replica(String rse, List<Files> files, boolean ignore_availability) {
		
		super();
		this.rse = rse;
		this.files = files;
		this.ignore_availability = ignore_availability;
		
	}

	public Replica() {
		// TODO Auto-generated constructor stub
		super();
	}

	public String getRse() {
		return rse;
	}

	public void setRse(String rse) {
		this.rse = rse;
	}

	public List<Files> getFiles() {
		return files;
	}

	public void setFiles(List<Files> files) {
		this.files = files;
	}

	public boolean isIgnore_availability() {
		return ignore_availability;
	}

	public void setIgnore_availability(boolean ignore_availability) {
		this.ignore_availability = ignore_availability;
	}
	
	@Override
	public String toString() {
		return "{'rse': " + this.rse + "," + " 'files': " + this.files + 
				"," + " 'ignore_availability': " + this.ignore_availability + "}";
	}

}
