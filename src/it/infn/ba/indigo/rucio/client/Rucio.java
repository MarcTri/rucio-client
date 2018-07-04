package it.infn.ba.indigo.rucio.client;

import java.util.List;

import it.infn.ba.indigo.rucio.client.model.RSEDetails;
import it.infn.ba.indigo.rucio.client.model.RSEEntity;
import it.infn.ba.indigo.rucio.client.model.Replicas;
import it.infn.ba.indigo.rucio.client.model.Token;
import it.infn.ba.indigo.rucio.client.utils.RucioException;

public interface Rucio {
	
	//GET /auth/validate ------> Validate a Rucio Auth Token
	Token get_validateToken() throws RucioException;
	
	//GET /rses/(rse) ------> details of rse
	RSEDetails get_RSEDetails(String name) throws RucioException;
	
	//GET /rses/      ------> print list of rses
	List<RSEEntity> get_RSEs() throws RucioException;
	
	//GET /replicas/(scope)/(name)      ------> print list all replicas for data identifiers
	List<Replicas> get_replicas(String scope, String name) throws RucioException;

}
