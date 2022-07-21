package com.hackathon.upakriti.services;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.HttpClients;

public class SolrService {
	static String uploadUrl="http://localhost:8983/solr/hackathon/update?commit=true";
	
	void uploadDoc(String data) {
		HttpPost post=new HttpPost(uploadUrl);
		post.setHeader("Content-Type", "application/json");
		try {
			CloseableHttpClient httpClient = HttpClients.createDefault();
			CloseableHttpResponse response=httpClient.execute(post);
		} catch (ClientProtocolException e) {
			System.out.println("Exception while pushing data to solr");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Exception while pushing data to solr");
			e.printStackTrace();
		}
	}
}
