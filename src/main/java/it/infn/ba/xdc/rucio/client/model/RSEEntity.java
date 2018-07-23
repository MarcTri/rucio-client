package it.infn.ba.xdc.rucio.client.model;

public class RSEEntity{
	
	private String rse_type;
	private String id;
	private String region_code;
	private String city;
	private String updated_at;
	private String rse;
	private String created_at;
	private String isp;
	private boolean deleted;
	private String time_zone;
	private Double longitude;
	private int availability;
	private boolean deterministic;
	private boolean _volatile;
	private String country_name;
	private Double latitude;
	private String deleted_at;
	private String continent;
	private String asn;
	private boolean staging_area;
	
	public RSEEntity(String rse_type, String id, String region_code, String city, String updated_at, String rse,
			String created_at, String isp, boolean deleted, String time_zone, Double longitude, int availability,
			boolean deterministic, boolean _volatile, String country_name, Double latitude, String deleted_at,
			String continent, String asn, boolean staging_area) {
		
		super();
		this.rse_type = rse_type;
		this.id = id;
		this.region_code = region_code;
		this.city = city;
		this.updated_at = updated_at;
		this.rse = rse;
		this.created_at = created_at;
		this.isp = isp;
		this.deleted = deleted;
		this.time_zone = time_zone;
		this.longitude = longitude;
		this.availability = availability;
		this.deterministic = deterministic;
		this._volatile = _volatile;
		this.country_name = country_name;
		this.latitude = latitude;
		this.deleted_at = deleted_at;
		this.continent = continent;
		this.asn = asn;
		this.staging_area = staging_area;
		
	}

	public RSEEntity() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public String getRse_type() {
		return rse_type;
	}
	
	public void setRse_type(String rse_type) {
		this.rse_type = rse_type;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getRegion_code() {
		return region_code;
	}
	
	public void setRegion_code(String region_code) {
		this.region_code = region_code;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getUpdated_at() {
		return updated_at;
	}
	
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	
	public String getRse() {
		return rse;
	}
	
	public void setRse(String rse) {
		this.rse = rse;
	}
	
	public String getCreated_at() {
		return created_at;
	}
	
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	
	public String getISP() {
		return isp;
	}
	
	public void setISP(String isp) {
		this.isp = isp;
	}
	
	public boolean isDeleted() {
		return deleted;
	}
	
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	
	public String getTime_zone() {
		return time_zone;
	}
	
	public void setTime_zone(String time_zone) {
		this.time_zone = time_zone;
	}
	
	public Double getLongitude() {
		return longitude;
	}
	
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	public int getAvailability() {
		return availability;
	}
	
	public void setAvailability(int availability) {
		this.availability = availability;
	}
	
	public boolean isDeterministic() {
		return deterministic;
	}
	
	public void setDeterministic(boolean deterministic) {
		this.deterministic = deterministic;
	}
	
	public boolean is_volatile() {
		return _volatile;
	}
	
	public void set_volatile(boolean _volatile) {
		this._volatile = _volatile;
	}
	
	public String getCountry_name() {
		return country_name;
	}
	
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	
	public Double getLatitude() {
		return latitude;
	}
	
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	
	public String getDeleted_at() {
		return deleted_at;
	}
	
	public void setDeleted_at(String deleted_at) {
		this.deleted_at = deleted_at;
	}
	
	public String getContinent() {
		return continent;
	}
	
	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	public String getASN() {
		return asn;
	}
	
	public void setASN(String asn) {
		this.asn = asn;
	}
	
	public boolean isStaging_area() {
		return staging_area;
	}
	
	public void setStaging_area(boolean staging_area) {
		this.staging_area = staging_area;
	}
	
	@Override
	public String toString() {
		return "{'rse_type': " + this.rse_type + "," + " 'id': " + this.id + "," +
				" 'region_code': " + this.region_code + "," + " 'city': " + this.city +
				"," + " 'updated_at': " + this.updated_at + "," + 
				" 'rse': " + this.rse + "," + " 'created_at': " + this.created_at + 
				"," + " 'ISP': " + this.isp + "," + " 'deleted': " + this.deleted +
				"," + " 'time_zone': " + this.time_zone + "," + " 'longitude': " + this.longitude +
				"," + " 'availability': " + this.availability + "," + " 'deterministic': " + this.deterministic +
				"," + " 'volatile': " + this._volatile + "," + " 'country_name': " + "," +
				" 'latitude': " + this.latitude + "," + " 'deleted_at': " + this.deleted_at +
				"," + " 'continent': " + this.continent + "," + " 'ASN': " + this.asn +
				"," + " 'staging_area': " + this.staging_area + "}";
		
	}

}
