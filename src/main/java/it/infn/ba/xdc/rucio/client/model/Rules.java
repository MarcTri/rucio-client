package it.infn.ba.xdc.rucio.client.model;

import java.util.Map;

public class Rules {
	
	private int locks_ok_cnt;
	private String source_replica_expression;
	private String weight;
	private boolean purge_replicas;
	private String rse_expression;
	private String updated_at;
	private Map<String, String> meta;
	private String child_rule_id;
	private String id;
	private boolean ignore_account_limit;
	private int locks_stuck_cnt;
	private int locks_replicating_cnt;
	private String notification;
	private int copies;
	private String comments;
	private boolean split_container;
	private int priority;
	private String state;
	private String scope;
	private String subscription_id;
	private boolean ignore_availability;
	private String stuck_at;
	private String error;
	private String eol_at;
	private String expires_at;
	private String did_type;
	private String account;
	private boolean locked;
	private String name;
	private String created_at;
	private String activity;
	private String grouping;
	
	public Rules(int locks_ok_cnt, String source_replica_expression, String weight, boolean purge_replicas,
				String rse_expression, String updated_at, Map<String, String> meta, String child_rule_id,
				String id, boolean ignore_account_limit, int locks_stuck_cnt, int locks_replicating_cnt,
				String notification, int copies, String comments, boolean split_container, int priority,
				String state, String scope, String subscription_id, boolean ignore_availability, String stuck_at,
				String error, String eol_at, String expires_at, String did_type, String account, boolean locked,
				String name, String created_at, String activity, String grouping) {
		
		super();
		this.locks_ok_cnt = locks_ok_cnt;
		this.source_replica_expression = source_replica_expression;
		this.weight = weight;
		this.purge_replicas = purge_replicas;
		this.rse_expression = rse_expression;
		this.updated_at = updated_at;
		this.meta = meta;
		this.child_rule_id = child_rule_id;
		this.id = id;
		this.ignore_account_limit = ignore_account_limit;
		this.locks_stuck_cnt = locks_stuck_cnt;
		this.locks_replicating_cnt = locks_replicating_cnt;
		this.notification = notification;
		this.copies = copies;
		this.comments = comments;
		this.split_container = split_container;
		this.priority = priority;
		this.state = state;
		this.scope = scope;
		this.subscription_id = subscription_id;
		this.ignore_availability = ignore_availability;
		this.stuck_at = stuck_at;
		this.error = error;
		this.eol_at = eol_at;
		this.expires_at = expires_at;
		this.did_type = did_type;
		this.account = account;
		this.locked = locked;
		this.name = name;
		this.created_at = created_at;
		this.activity = activity;
		this.grouping = grouping;
		
	}

	public Rules() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public int getLocks_ok_cnt() {
		return locks_ok_cnt;
	}

	public void setLocks_ok_cnt(int locks_ok_cnt) {
		this.locks_ok_cnt = locks_ok_cnt;
	}

	public String getSource_replica_expression() {
		return source_replica_expression;
	}

	public void setSource_replica_expression(String source_replica_expression) {
		this.source_replica_expression = source_replica_expression;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public boolean isPurge_replicas() {
		return purge_replicas;
	}

	public void setPurge_replicas(boolean purge_replicas) {
		this.purge_replicas = purge_replicas;
	}

	public String getRse_expression() {
		return rse_expression;
	}

	public void setRse_expression(String rse_expression) {
		this.rse_expression = rse_expression;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public Map<String, String> getMeta() {
		return meta;
	}

	public void setMeta(Map<String, String> meta) {
		this.meta = meta;
	}

	public String getChild_rule_id() {
		return child_rule_id;
	}

	public void setChild_rule_id(String child_rule_id) {
		this.child_rule_id = child_rule_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isIgnore_account_limit() {
		return ignore_account_limit;
	}

	public void setIgnore_account_limit(boolean ignore_account_limit) {
		this.ignore_account_limit = ignore_account_limit;
	}

	public int getLocks_stuck_cnt() {
		return locks_stuck_cnt;
	}

	public void setLocks_stuck_cnt(int locks_stuck_cnt) {
		this.locks_stuck_cnt = locks_stuck_cnt;
	}

	public int getLocks_replicating_cnt() {
		return locks_replicating_cnt;
	}

	public void setLocks_replicating_cnt(int locks_replicating_cnt) {
		this.locks_replicating_cnt = locks_replicating_cnt;
	}

	public String getNotification() {
		return notification;
	}

	public void setNotification(String notification) {
		this.notification = notification;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public boolean isSplit_container() {
		return split_container;
	}

	public void setSplit_container(boolean split_container) {
		this.split_container = split_container;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getSubscription_id() {
		return subscription_id;
	}

	public void setSubscription_id(String subscription_id) {
		this.subscription_id = subscription_id;
	}

	public boolean isIgnore_availability() {
		return ignore_availability;
	}

	public void setIgnore_availability(boolean ignore_availability) {
		this.ignore_availability = ignore_availability;
	}

	public String getStuck_at() {
		return stuck_at;
	}

	public void setStuck_at(String stuck_at) {
		this.stuck_at = stuck_at;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getEol_at() {
		return eol_at;
	}

	public void setEol_at(String eol_at) {
		this.eol_at = eol_at;
	}

	public String getExpires_at() {
		return expires_at;
	}

	public void setExpires_at(String expires_at) {
		this.expires_at = expires_at;
	}

	public String getDid_type() {
		return did_type;
	}

	public void setDid_type(String did_type) {
		this.did_type = did_type;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getGrouping() {
		return grouping;
	}

	public void setGrouping(String grouping) {
		this.grouping = grouping;
	}

	@Override
	public String toString() {
		return "{'locks_ok_cnt': " + this.locks_ok_cnt + "," + " 'source_replica_expression': " + this.source_replica_expression + "," +
				" 'weight': " + this.weight + "," + " 'purge_replicas': " + this.purge_replicas + "," + 
				" 'rse_expression': " + this.rse_expression + "," + " 'updated_at': " + this.updated_at + "," +
				" 'meta': " + this.meta + "," + " 'child_rule_id': " + this.child_rule_id + "," + " 'id': " +
				this.id + "," + " 'ignore_account_limit': " + this.ignore_account_limit +
				"," + " 'locks_stuck_cnt': " + this.locks_stuck_cnt + " 'locks_replicating_cnt': " + this.locks_replicating_cnt + " 'notification': " + this.notification +
				"," + " 'copies': " + this.copies + "," + " 'comments': " + this.comments +
				"," + " 'split_container': " + this.split_container + "," + " 'priority': " + this.priority +
				"," + " 'state': " + this.state + "," + " 'scope': " + this.scope +
				"," + " 'subscription_id': " + this.subscription_id + "," + " 'ignore_availability': " + this.ignore_availability + 
				"," + " 'stuck_at': " + this.stuck_at + "," + " 'error':" + this.error + "," + " 'eol_at': " + this.eol_at + 
				"," + " 'expires_at': " + this.expires_at + "," + " 'did_type': " + this.did_type + 
				"," + " 'account': " + this.account + "," + " 'locked': " + this.locked + "," + 
				" 'name': " + this.name + "," + " 'created_at': " + this.created_at + "," 
				+ " 'activity': " + this.activity + "," + " 'grouping': " + this.grouping + "}";
	}

}
