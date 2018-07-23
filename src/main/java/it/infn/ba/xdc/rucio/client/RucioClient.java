package it.infn.ba.xdc.rucio.client;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import it.infn.ba.xdc.rucio.client.model.RSEDetails;
import it.infn.ba.xdc.rucio.client.model.RSEEntity;
import it.infn.ba.xdc.rucio.client.model.Replica;
import it.infn.ba.xdc.rucio.client.model.Replicas;
import it.infn.ba.xdc.rucio.client.model.Rule;
import it.infn.ba.xdc.rucio.client.model.Rule_;
import it.infn.ba.xdc.rucio.client.model.Rules;
import it.infn.ba.xdc.rucio.client.model.Token;
import it.infn.ba.xdc.rucio.client.utils.Auth_userpass;
import it.infn.ba.xdc.rucio.client.utils.IstanceClient;
import it.infn.ba.xdc.rucio.client.utils.Properties_rucio;
import it.infn.ba.xdc.rucio.client.utils.RucioException;


public class RucioClient implements Rucio{
	
	private static Client client = IstanceClient.getIstance(); 
	
	private static final String REST_URI = Properties_rucio.get_properties().getProperty("endpoint");
	
	private static final String token = Auth_userpass.get_token(client, REST_URI);
	
	private Gson gson = new Gson(); 
	
	private static WebTarget webTarget;
	
	private String x_rucio_auth_token = "X-Rucio-Auth-Token";
	
	//GET /auth/validate
	public Token get_validateToken() throws RucioException {
		
		Token tok = new Token();
		
		webTarget = client
						 .target(REST_URI)
						 .path("/auth/validate");
		
		Response response = webTarget
									.request()
						   		    .header(x_rucio_auth_token, token)
								    .header("Rucio-Auth-Token", token)
								    .get();
		
		String entity = response.readEntity(String.class);
		
		if (response.getStatus() == 200) {
			
			String token_ = entity.replace("}", "");
			String[] t = token_.split(":");
			
			List<String> _token = new ArrayList<String>();
			_token.add(t[1]);
			_token.add(t[2]);
			_token.add(t[3]);
			
			tok.setLifetime(_token.get(0).replaceAll(", 'account'", ""));
			tok.setAccount(_token.get(1).replaceAll(", 'identity'", ""));
			tok.setIdentity(_token.get(2));
			
			return tok;
		}
		else {
			throw new RucioException(entity);
		}
		
	}
	
	
	//GET /rses/(rse)
	public RSEDetails get_RSEDetails(String name) throws RucioException {
		 
		webTarget = client
						 .target(REST_URI)
						 .path("/rses/" + name);
		
		Response response = webTarget
								   .request()
								   .header(x_rucio_auth_token, token)
								   .header("Content-Type", "application/json")
								   .get();
								   
		String entity = response.readEntity(String.class);
		
		if (response.getStatus() == 200) {
			RSEDetails rse_details = gson.fromJson(entity, RSEDetails.class);
			return rse_details;
		}
		else{
			throw new RucioException(entity);
		}
	}
	
	
	//GET /rses/ 
	public List<RSEEntity> get_RSEs() throws RucioException{
		
		List<RSEEntity> list_obj_rses = new ArrayList<RSEEntity>();
		String _regex = "\\r?\\n";
		
		webTarget = client
						 .target(REST_URI)
						 .path("/rses/");
		
		Response response = webTarget
								   .request()
								   .header(x_rucio_auth_token, token)
								   .header("Content-Type", "application/x-json-stream")
								   .get();
		
		String rses = response.readEntity(String.class);
		
		if (response.getStatus() == 200) {
			
			String[] list_rses = rses.split(_regex);
			for (String rse : list_rses) {
				RSEEntity rse_gson = gson.fromJson(rse, RSEEntity.class);
				list_obj_rses.add(rse_gson);
			}
			
			return list_obj_rses;
		}
		else{
			throw new RucioException(rses);
		}
	}
	
	
	//GET /replicas/(scope)/(name)
	public List<Replicas> get_replicas(String scope, String name) throws RucioException{
		
		List<Replicas> list_obj_replicas = new ArrayList<Replicas>();
		String _regex = "\\r?\\n";
		
		webTarget = client
						 .target(REST_URI)
						 .path("/replicas/" + scope + "/" + name);
		
		Response response = webTarget
									.request()
									.header(x_rucio_auth_token, token)
									.header("HTTP_ACCEPT", "application/metalink4+xml")
									.get();
		
		String replicas = response.readEntity(String.class);
		
		if (response.getStatus() == 200) {
			
			String[] list_replicas = replicas.split(_regex);
			for (String re : list_replicas) {
				Replicas replica_gson = gson.fromJson(re, Replicas.class);
				list_obj_replicas.add(replica_gson);
			}
			
			return list_obj_replicas;
			
		}
		else{
			throw new RucioException(replicas);
		}
	}
	
	
	//POST /replicas/
	public void createReplica(Replica replica) throws RucioException{
		
		String rep = gson.toJson(replica);
		
		webTarget = client
						  .target(REST_URI)
						  .path("/replicas/");
		
		Response response = webTarget
									.request()
									.header(x_rucio_auth_token, token)
									.post(Entity.json(rep));
		
		String entity = response.readEntity(String.class);
		
		if (response.getStatus() == 201) {
			System.out.println(entity);
		}
		else {
			throw new RucioException(entity);
		}
		
	}
	
	
	//GET /rules/    
	public List<Rules> get_rules() throws RucioException{
		
		List<Rules> list_obj_rules = new ArrayList<Rules>();
		String _regex = "\\r?\\n";
		
		webTarget = client
						  .target(REST_URI)
						  .path("/rules/");
		
		Response response = webTarget
									.request()
									.header(x_rucio_auth_token, token)
									.header("Content-Type", "application/x-json-stream")
									.get();
		
		String rules = response.readEntity(String.class);
		
		if (response.getStatus() == 200) {
			
			String[] list_rules = rules.split(_regex);
			for (String ru : list_rules) {
				Rules rule_gson = gson.fromJson(ru, Rules.class);
				list_obj_rules.add(rule_gson);
			}
			
			return list_obj_rules;
			
		}
		else{
			throw new RucioException(rules);
		}
		
	}
	
	
	//POST /rules/
	public void createRule(Rule rule) throws RucioException{
		
		String rul = gson.toJson(rule);
		
		webTarget = client
						 .target(REST_URI)
						 .path("/rules/");
		
		Response response = webTarget
									.request()
									.header(x_rucio_auth_token, token)
									.post(Entity.json(rul));
		
		String entity = response.readEntity(String.class);
		
		if (response.getStatus() == 201) {
			System.out.println(entity);
		}
		else {
			throw new RucioException(entity);
		}
		
	}
	
	
	//GET /rules/(rule_id)
	public Rule_ get_RuleInformation(String rule_id) throws RucioException {
		
		webTarget = client
						  .target(REST_URI)
						  .path("/rules/" + rule_id);
		
		Response response = webTarget
								   .request()
								   .header(x_rucio_auth_token, token)
								   .get();
								   
		String entity = response.readEntity(String.class);
		
		if (response.getStatus() == 200) {
			Rule_ rule_information = gson.fromJson(entity, Rule_.class);
			return rule_information;
		}
		else{
			throw new RucioException(entity);
		}
	}
	
}
