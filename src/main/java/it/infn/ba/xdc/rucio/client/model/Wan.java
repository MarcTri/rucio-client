package it.infn.ba.xdc.rucio.client.model;

public class Wan {
	
	private int read;
	private int write;
	private int third_party_copy;
	private int delete;
	
	public Wan(int read, int write, int third_party_copy, int delete) {
		
		super();
		this.read = read;
		this.write = write;
		this.third_party_copy = third_party_copy;
		this.delete = delete;
		
	}
	
	public Wan() {
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

	public int getThird_party_copy() {
		return third_party_copy;
	}

	public void setThird_party_copy(int third_party_copy) {
		this.third_party_copy = third_party_copy;
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
				" 'third_party_copy': " + this.third_party_copy + "," +
				" 'delete': " + this.delete + "}";
	}
		
}
