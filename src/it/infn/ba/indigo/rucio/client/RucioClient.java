package it.infn.ba.indigo.rucio.client;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import it.infn.ba.indigo.rucio.client.model.RSEDetails;
import it.infn.ba.indigo.rucio.client.model.RSEEntity;
import it.infn.ba.indigo.rucio.client.model.Replicas;
import it.infn.ba.indigo.rucio.client.model.Token;
import it.infn.ba.indigo.rucio.client.utils.Auth_userpass;
import it.infn.ba.indigo.rucio.client.utils.IstanceClient;
import it.infn.ba.indigo.rucio.client.utils.Properties_rucio;
import it.infn.ba.indigo.rucio.client.utils.RucioException;


public class RucioClient implements Rucio{
	
	private static Client client = IstanceClient.getIstance(); 
	
	private static final String REST_URI = Properties_rucio.get_properties().getProperty("endpoint");
	
	private static final String token = Auth_userpass.get_token(client, REST_URI);
	
	private Gson gson = new Gson();
	
	private static WebTarget webTarget;
	
	//GET /auth/validate
	public Token get_validateToken() throws RucioException {
		
		Token tok = new Token();
		
		webTarget = client
						 .target(REST_URI)
						 .path("/auth/validate");
		
		Response response = webTarget
									.request()
						   		    .header("X-Rucio-Auth-Token", token)
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
								   .header("X-Rucio-Auth-Token", token)
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
								   .header("X-Rucio-Auth-Token", token)
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
									.header("X-Rucio-Auth-Token", token)
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
	
}//end class
