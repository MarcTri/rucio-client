package it.infn.ba.indigo.rucio.client.utils;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class IstanceClient {
	
	public static Client getIstance() {
		
		SSLContext sslContext = null;
		
		TrustManager[] trustAllCerts = new X509TrustManager[] {new X509TrustManager() {
			@Override
			public java.security.cert.X509Certificate[] getAcceptedIssuers(){
				return null;
			}
			@Override
			public void checkClientTrusted(X509Certificate[] certs, String authType) {
				
			}
			@Override
			public void checkServerTrusted(X509Certificate[] certs, String authType) {
				
			}
		}
		};
		try {
			sslContext = SSLContext.getInstance("SSL");
			sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
			
			HostnameVerifier allHostsValid = new HostnameVerifier() {
				public boolean verify(String arg0, SSLSession arg1) {
					return true;
				}
			};
			
			HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
			
		} catch (NoSuchAlgorithmException | KeyManagementException e) {}
		
		Client client = ClientBuilder
									.newBuilder()
									.sslContext(sslContext)
									.build();
		
		return client;
		
	}

}
