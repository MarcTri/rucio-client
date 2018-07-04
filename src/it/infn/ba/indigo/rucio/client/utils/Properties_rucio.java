package it.infn.ba.indigo.rucio.client.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Properties_rucio {
	
	private static String filePath = "application.properties";
	
	private static Properties prop = new Properties();
	
	public static Properties get_properties() {
		
		InputStream inputStream = Properties_rucio.class
												  .getClassLoader()
												  .getResourceAsStream(filePath);
		try {
			prop.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
		
	}

}
