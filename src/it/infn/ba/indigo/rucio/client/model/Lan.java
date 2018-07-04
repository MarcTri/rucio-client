package it.infn.ba.indigo.rucio.client.model;

public class Lan {
	
	private int read;
	private int write;
	private int delete;
	
	public Lan(int read, int write, int delete) {
		
		super();
		this.read = read;
		this.write = write;
		this.delete = delete;
		
	}

	public Lan() {
		// TODO Auto-generated constructor stub
		super();
	}

	public int getRead() {
		return read;
	}

	public void setRead(int read) {
		this.read = read;
	}

	public int getWrite() {
		return write;
	}

	public void setWrite(int write) {
		this.write = write;
	}

	public int getDelete() {
		return delete;
	}

	public void setDelete(int delete) {
		this.delete = delete;
	}
	
	@Override
	public String toString() {
		return "{'read': " + this.read + "," + " 'write': " + this.write + "," +
				" 'delete': " + this.delete + "}";
	}
	

}
