package it.infn.ba.xdc.rucio.client;

import java.util.List;

import it.infn.ba.xdc.rucio.client.model.RSEDetails;
import it.infn.ba.xdc.rucio.client.model.RSEEntity;
import it.infn.ba.xdc.rucio.client.model.Replica;
import it.infn.ba.xdc.rucio.client.model.Replicas;
import it.infn.ba.xdc.rucio.client.model.Rule;
import it.infn.ba.xdc.rucio.client.model.Rule_;
import it.infn.ba.xdc.rucio.client.model.Rules;
import it.infn.ba.xdc.rucio.client.model.Token;
import it.infn.ba.xdc.rucio.client.utils.RucioException;

public interface Rucio {
	
	//GET /auth/validate ------> Validate a Rucio Auth Token
	Token get_validateToken() throws RucioException;
	
	//GET /rses/(rse) ------> details of rse
	RSEDetails get_RSEDetails(String name) throws RucioException;
	
	//GET /rses/      ------> print list of rses
	List<RSEEntity> get_RSEs() throws RucioException;
	
	//GET /replicas/(scope)/(name)      ------> print list all replicas for data identifiers
	List<Replicas> get_replicas(String scope, String name) throws RucioException;
	
	//POST /replicas/  ------> create replicas at RSE
	void createReplica(Replica replica) throws RucioException;
	
	//GET /rules/      ------> get all rules for account
	List<Rules> get_rules() throws RucioException;
	
	//POST /rules/  ------> create a new replication rule
	void createRule(Rule rule) throws RucioException;
	
	//GET /rules/(rule_id)   ------> get rule information for given rule id
	Rule_ get_RuleInformation(String rule_id) throws RucioException; 

}
