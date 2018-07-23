package it.infn.ba.xdc.rucio.client.main;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import it.infn.ba.xdc.rucio.client.Rucio;
import it.infn.ba.xdc.rucio.client.RucioClient;
import it.infn.ba.xdc.rucio.client.model.Dids;
import it.infn.ba.xdc.rucio.client.model.Files;
import it.infn.ba.xdc.rucio.client.model.RSEDetails;
import it.infn.ba.xdc.rucio.client.model.RSEEntity;
import it.infn.ba.xdc.rucio.client.model.Replica;
import it.infn.ba.xdc.rucio.client.model.Replicas;
import it.infn.ba.xdc.rucio.client.model.Rule;
import it.infn.ba.xdc.rucio.client.model.Rule_;
import it.infn.ba.xdc.rucio.client.model.Rules;
import it.infn.ba.xdc.rucio.client.model.Token;
import it.infn.ba.xdc.rucio.client.utils.RucioException;

public class RucioRestServiceClient {
	
	private static Rucio rucio_client = new RucioClient();
	
	private static Gson gson = new GsonBuilder().serializeNulls()
												.setPrettyPrinting()
												.disableHtmlEscaping()
												.create();
	
	
	//GET /auth/validate ------> Validate a Rucio Auth Token
	public static void testGetValidateToken() {
		
		Token token;
		try {
			token = rucio_client.get_validateToken();
			String token_ = gson.toJson(token);
			System.out.println(token_);
		} catch (RucioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//GET /rses/(rse) ------> details of rse
	public static void testGetRSE(){
		
		RSEDetails rse_details;
		try {
			rse_details = rucio_client.get_RSEDetails("SITE1_DISK");
			String details = gson.toJson(rse_details);
			System.out.println(details);
		} catch (RucioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//GET /rses/     ------> print rses
	public static void testGetRSEs() {
		
		List<RSEEntity> rse_entity = new ArrayList<RSEEntity>();
		try {
			rse_entity = rucio_client.get_RSEs();
			for (RSEEntity e : rse_entity) {
				String rse = gson.toJson(e);
				System.out.println(rse);
			}
		}catch(RucioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//GET /replicas/(scope)/(name)      ------> print list all replicas for data identifiers 
	public static void testGetReplicas() {
		
		List<Replicas> replica_entity = new ArrayList<Replicas>();
		try {
			replica_entity = rucio_client.get_replicas("user.antonacci", "marica-test");
			for (Replicas r : replica_entity) {
				String replica = gson.toJson(r);
				System.out.println(replica);
			}
		}catch(RucioException e) {
			e.printStackTrace();
		}
	}
	
	
	//POST /replicas/  ------> create replicas at RSE
	public static void testCreateReplica() {
		
		Replica replica = new Replica();
		List<Files> files = new ArrayList<Files>();
		Files files_ = new Files();
		
		files_.setScope("user.antonacci");
		files_.setName("test7");
		files_.setBytes(5);
		files_.setAdler32("062801cb");
		files_.setPfn("srm://cloud-90-147-75-228.cloud.ba.infn.it:8444/srm/managerv2?SFN=/vo.indigo-datacloud.eu/rucio/01");
		files.add(files_);
		
		replica.setRse("RECAS-BARI_DATADISK2");
		replica.setFiles(files);
		
		try {
			rucio_client.createReplica(replica);
		} catch (RucioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//GET /rules/      ------> get all rules for account
	public static void testGetRules() {
		
		List<Rules> rules = new ArrayList<Rules>();
		try {
			rules = rucio_client.get_rules();
			for (Rules r : rules) {
				String rule = gson.toJson(r);
				System.out.println(rule);
			}
		}catch(RucioException e) {
			e.printStackTrace();
		}
		
	}
	
	
	//POST /rules/  ------> create a new replication rule
	public static void testCreateRule() {
		
		Rule rule = new Rule();
		Dids dids = new Dids();
		List<Dids> dids_ = new ArrayList<Dids>();
		
		dids.setScope("user.antonacci");
		dids.setName("marica-test");
		dids_.add(dids);
		
		rule.setDids(dids_);
		rule.setAccount("antonacci");
		rule.setCopies(2);
		rule.setRse_expression("country=Italy");
		rule.setLifetime(300);
		
		try {
			rucio_client.createRule(rule);
		} catch (RucioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	//GET /rules/(rule_id) ------> get rule information for given rule id
		public static void testGetRule(){
			
			Rule_ rule_;
			try {
				rule_ = rucio_client.get_RuleInformation("0772adb0df594b61b7d46ecd6562207e");
				String rule_i = gson.toJson(rule_);
				System.out.println(rule_i);
			} catch (RucioException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	
	
	public static void main(String[] args) {
		
		testGetValidateToken();
		System.out.println();
		
		testGetRSE();
		System.out.println();
		
		testGetRSEs();
		System.out.println();
		
		testGetReplicas();
		System.out.println();
		
		testCreateReplica();
		System.out.println();
		
		testGetRules();
		System.out.println();
		
		testCreateRule();
		System.out.println();
		
		testGetRule();
		System.out.println();
		
	}

}
