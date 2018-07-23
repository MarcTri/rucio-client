package it.infn.ba.xdc.rucio.client.model;

import java.util.List;
import java.util.Map;

public class Rule {
	
	private List<Dids> dids;
	private String account;
	private int copies;
	private String rse_expression;
	private String grouping;
	private String weight;
	private int lifetime;
	private String locked;
	private String subscription_id;
	private String source_replica_expression;
	private String activity;
	private String notify;
	private boolean purge_replicas;
	private boolean ignore_availability;
	private String comments;
	private boolean ask_approval;
	private boolean asynchronous;
	private int priority;
	private boolean split_container;
	private Map<String, String> meta;
	
	public Rule(List<Dids> dids, String account, int copies, String rse_expression, String grouping, String weight,
				int lifetime, String locked, String subscription_id, String source_replica_expression, String activity,
				String notify, boolean purge_replicas, boolean ignore_availability, String comments, boolean ask_approval,
				boolean asynchronous, int priority, boolean split_container, Map<String, String> meta) {
		
		super();
		this.dids = dids;
		this.account = account;
		this.copies = copies;
		this.rse_expression = rse_expression;
		this.grouping = grouping;
		this.weight = weight;
		this.lifetime = lifetime;
		this.locked = locked;
		this.subscription_id = subscription_id;
		this.source_replica_expression = source_replica_expression;
		this.activity = activity;
		this.notify = notify;
		this.purge_replicas = purge_replicas;
		this.ignore_availability = ignore_availability;
		this.comments = comments;
		this.ask_approval = ask_approval;
		this.asynchronous = asynchronous;
		this.priority = priority;
		this.split_container = split_container;
		this.meta = meta;
		
	}

	public Rule() {
		// TODO Auto-generated constructor stub
		super();
	}

	public List<Dids> getDids() {
		return dids;
	}

	public void setDids(List<Dids> dids) {
		this.dids = dids;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	public String getRse_expression() {
		return rse_expression;
	}

	public void setRse_expression(String rse_expression) {
		this.rse_expression = rse_expression;
	}

	public String getGrouping() {
		return grouping;
	}

	public void setGrouping(String grouping) {
		this.grouping = grouping;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public int getLifetime() {
		return lifetime;
	}

	public void setLifetime(int lifetime) {
		this.lifetime = lifetime;
	}

	public String getLocked() {
		return locked;
	}

	public void setLocked(String locked) {
		this.locked = locked;
	}

	public String getSubscription_id() {
		return subscription_id;
	}

	public void setSubscription_id(String subscription_id) {
		this.subscription_id = subscription_id;
	}

	public String getSource_replica_expression() {
		return source_replica_expression;
	}

	public void setSource_replica_expression(String source_replica_expression) {
		this.source_replica_expression = source_replica_expression;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getNotify() {
		return notify;
	}

	public void setNotify(String notify) {
		this.notify = notify;
	}

	public boolean isPurge_replicas() {
		return purge_replicas;
	}

	public void setPurge_replicas(boolean purge_replicas) {
		this.purge_replicas = purge_replicas;
	}

	public boolean isIgnore_availability() {
		return ignore_availability;
	}

	public void setIgnore_availability(boolean ignore_availability) {
		this.ignore_availability = ignore_availability;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public boolean isAsk_approval() {
		return ask_approval;
	}

	public void setAsk_approval(boolean ask_approval) {
		this.ask_approval = ask_approval;
	}

	public boolean isAsynchronous() {
		return asynchronous;
	}

	public void setAsynchronous(boolean asynchronous) {
		this.asynchronous = asynchronous;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public boolean isSplit_container() {
		return split_container;
	}

	public void setSplit_container(boolean split_container) {
		this.split_container = split_container;
	}

	public Map<String, String> getMeta() {
		return meta;
	}

	public void setMeta(Map<String, String> meta) {
		this.meta = meta;
	}
	
	@Override
	public String toString() {
		return "{'dids': " + this.dids + "," + " 'account': " + this.account + "," +
				" 'copies': " + this.copies + "," + " 'rse_expression': " + this.rse_expression + "," + 
				" 'grouping': " + this.grouping + "," + " 'weight': " + this.weight + "," +
				" 'lifetime': " + this.lifetime + "," + " 'locked': " + this.locked + "," + " 'subscription_id': " +
				this.subscription_id + "," + " 'source_replica_expression': " + this.source_replica_expression +
				"," + " 'activity': " + this.activity + " 'notify': " + this.notify + " 'purge_replicas': " + this.purge_replicas +
				"," + " 'ignore_availability': " + this.ignore_availability + "," + " 'comments': " + this.comments +
				"," + " 'ask_approval': " + this.ask_approval + "," + " 'asynchronous': " + this.asynchronous +
				"," + " 'priority': " + this.priority + "," + " 'split_container': " + this.split_container +
				"," + " 'meta': " + this.meta + "}";
	}

}
