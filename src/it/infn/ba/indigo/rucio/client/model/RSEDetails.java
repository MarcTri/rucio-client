package it.infn.ba.indigo.rucio.client.model;

import java.util.List;

public class RSEDetails {
	
	private int third_party_copy_protocol;
	private String rse_type;
	private List<String> domain;
	private boolean availability_delete;
	private int delete_protocol;
	private String rse;
	private boolean deterministic;
	private int write_protocol;
	private int read_protocol;
	private boolean staging_area;
	private String lfn2pfn_algorithm;
	private boolean availability_write;
	private boolean _volatile;
	private boolean availability_read;
	private String credentials;
	private boolean verify_checksum;
	private String id;
	private List<Protocols> protocols;
	
	public RSEDetails(int third_party_copy_protocol, String rse_type, List<String> domain, boolean availability_delete,
			int delete_protocol, String rse, boolean deterministic, int write_protocol, int read_protocol,
			boolean staging_area, String lfn2pfn_algorithm, boolean availability_write, boolean _volatile, boolean availability_read,
			String credentials, boolean verify_checksum, String id, List<Protocols> protocols) {
		
		super();
		this.third_party_copy_protocol = third_party_copy_protocol;
		this.rse_type = rse_type;
		this.domain = domain;
		this.availability_delete = availability_delete;
		this.delete_protocol = delete_protocol;
		this.rse = rse;
		this.deterministic = deterministic;
		this.write_protocol = write_protocol;
		this.read_protocol = read_protocol;
		this.staging_area = staging_area;
		this.lfn2pfn_algorithm = lfn2pfn_algorithm;
		this.availability_write = availability_write;
		this._volatile = _volatile;
		this.availability_read = availability_read;
		this.credentials = credentials;
		this.verify_checksum = verify_checksum;
		this.id = id;
		this.protocols = protocols;
		
	}
	
	public RSEDetails() {
		// TODO Auto-generated constructor stub
		super();
	}

	public int getThird_party_copy_protocol() {
		return third_party_copy_protocol;
	}

	public void setThird_party_copy_protocol(int third_party_copy_protocol) {
		this.third_party_copy_protocol = third_party_copy_protocol;
	}

	public String getRse_type() {
		return rse_type;
	}

	public void setRse_type(String rse_type) {
		this.rse_type = rse_type;
	}

	public List<String> getDomain() {
		return domain;
	}

	public void setDomain(List<String> domain) {
		this.domain = domain;
	}

	public boolean isAvailability_delete() {
		return availability_delete;
	}

	public void setAvailability_delete(boolean availability_delete) {
		this.availability_delete = availability_delete;
	}

	public int getDelete_protocol() {
		return delete_protocol;
	}

	public void setDelete_protocol(int delete_protocol) {
		this.delete_protocol = delete_protocol;
	}

	public String getRse() {
		return rse;
	}

	public void setRse(String rse) {
		this.rse = rse;
	}

	public boolean isDeterministic() {
		return deterministic;
	}

	public void setDeterministic(boolean deterministic) {
		this.deterministic = deterministic;
	}

	public int getWrite_protocol() {
		return write_protocol;
	}

	public void setWrite_protocol(int write_protocol) {
		this.write_protocol = write_protocol;
	}

	public int getRead_protocol() {
		return read_protocol;
	}

	public void setRead_protocol(int read_protocol) {
		this.read_protocol = read_protocol;
	}

	public boolean isStaging_area() {
		return staging_area;
	}

	public void setStaging_area(boolean staging_area) {
		this.staging_area = staging_area;
	}

	public String getLfn2pfn_algorithm() {
		return lfn2pfn_algorithm;
	}

	public void setLfn2pfn_algorithm(String lfn2pfn_algorithm) {
		this.lfn2pfn_algorithm = lfn2pfn_algorithm;
	}

	public boolean isAvailability_write() {
		return availability_write;
	}

	public void setAvailability_write(boolean availability_write) {
		this.availability_write = availability_write;
	}

	public boolean is_volatile() {
		return _volatile;
	}

	public void set_volatile(boolean _volatile) {
		this._volatile = _volatile;
	}

	public boolean isAvailability_read() {
		return availability_read;
	}

	public void setAvailability_read(boolean availability_read) {
		this.availability_read = availability_read;
	}

	public String getCredentials() {
		return credentials;
	}

	public void setCredentials(String credentials) {
		this.credentials = credentials;
	}

	public boolean isVerify_checksum() {
		return verify_checksum;
	}

	public void setVerify_checksum(boolean verify_checksum) {
		this.verify_checksum = verify_checksum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Protocols> getProtocols() {
		return protocols;
	}

	public void setProtocols(List<Protocols> protocols) {
		this.protocols = protocols;
	}
	
	@Override
	public String toString() {
		return "{'third_party_copy_protocol': " + this.third_party_copy_protocol + "," + " 'rse_type': " + this.rse_type + "," +
				" 'domain': " + this.domain + "," + " 'availability_delete': " + this.availability_delete +
				"," + " 'delete_protocol': " + this.delete_protocol + "," + 
				" 'rse': " + this.rse + "," + " 'deterministic': " + this.deterministic + 
				"," + " 'write_protocol': " + this.write_protocol + "," + " 'read_protocol': " + this.read_protocol +
				"," + " 'staging_area': " + this.staging_area + "," + " 'lfn2pfn_algorithm': " + this.lfn2pfn_algorithm +
				"," + " 'availability_write': " + this.availability_write + "," + " 'volatile': " + this._volatile +
				"," + " 'availability_read': " + this.availability_read + "," + " 'credentials': " + this.credentials + "," +
				" 'verify_checksum': " + this.verify_checksum + "," + " 'id': " + this.id +
				"," + " 'protocols': " + this.protocols + "}";
		
	}

}
