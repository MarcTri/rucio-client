package it.infn.ba.xdc.rucio.client.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
import it.infn.ba.xdc.rucio.client.utils.RucioException;
import it.infn.ba.xdc.rucio.client.model.Token;

public class RucioTest {
	
	private Rucio rucio_client = new RucioClient();
	
	@BeforeEach
	public void setup() {}
	
	public void get_validate_token() throws RucioException{
		Token token;
		token = rucio_client.get_validateToken();
		System.out.println(token.toString());
	}
	
	public void get_rse(String name) throws RucioException{
		RSEDetails rse_details;
		rse_details = rucio_client.get_RSEDetails(name);
		System.out.println(rse_details.toString());
	}
	
	public void get_rses() throws RucioException{
		List<RSEEntity> rse_entity = new ArrayList<RSEEntity>();
		rse_entity = rucio_client.get_RSEs();
		System.out.println(rse_entity.toString());
	}
	
	public void get_replicas(String scope, String name) throws RucioException{
		List<Replicas> replica_entity = new ArrayList<Replicas>();
		replica_entity = rucio_client.get_replicas(scope, name);
		System.out.println(replica_entity.toString());
	}
	
	public void create_replica() throws RucioException{
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
		
		rucio_client.createReplica(replica);	
	}
	
	public void get_rules() throws RucioException{
		List<Rules> rule_entity = new ArrayList<Rules>();
		rule_entity = rucio_client.get_rules();
		System.out.println(rule_entity.toString());
	}
	
	public void create_rule() throws RucioException{
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
		
		rucio_client.createRule(rule);
	}
	
	public void get_rule(String rule_id) throws RucioException{
		Rule_ rule_;
		rule_ = rucio_client.get_RuleInformation(rule_id);
		System.out.println(rule_.toString());
	}
	
	@Test
	public void flow() throws RucioException {
		get_validate_token();
		get_rse("SITE1_DISK");
		get_rses();
		get_replicas("user.antonacci", "marica-test");
		create_replica();
		get_rules();
		create_rule();
		get_rule("0772adb0df594b61b7d46ecd6562207e");
	}

}
