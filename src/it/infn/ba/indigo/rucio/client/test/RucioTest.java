package it.infn.ba.indigo.rucio.client.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import it.infn.ba.indigo.rucio.client.Rucio;
import it.infn.ba.indigo.rucio.client.RucioClient;
import it.infn.ba.indigo.rucio.client.model.RSEDetails;
import it.infn.ba.indigo.rucio.client.model.RSEEntity;
import it.infn.ba.indigo.rucio.client.model.Replicas;
import it.infn.ba.indigo.rucio.client.utils.RucioException;
import it.infn.ba.indigo.rucio.client.model.Token;

public class RucioTest {
	
	private Rucio rucio_client = new RucioClient();
	
	@Before
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
	
	@Test
	public void flow() throws RucioException {
		get_validate_token();
		get_rse("SITE1_DISK");
		get_rses();
		get_replicas("user.antonacci", "marica-test");
	}

}
