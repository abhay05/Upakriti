package com.hackathon.upakriti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.lang.*;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.simple.JSONObject;
import com.hackathon.upakriti.models.Question;

@SpringBootApplication
public class UpakritiApplication {
	static String uploadUrl="http://localhost:8983/solr/hackathon/update?commit=true";
	public static void main(String[] args) {
		SpringApplication.run(UpakritiApplication.class, args);
		
//		JSONObject add = new JSONObject();
//		JSONObject doc=new JSONObject();
//		Question qa=new Question("qid","visa","abh","title","description",System.currentTimeMillis(),System.currentTimeMillis());
//		doc.put("doc", qa.toString());
//		add.put("add",doc);
//		
//		HttpPost post=new HttpPost(uploadUrl);
//		post.setHeader("Content-Type", "application/json");
//		try {
//			CloseableHttpClient httpClient = HttpClients.createDefault();
//			CloseableHttpResponse response=httpClient.execute(post);
//		} catch (ClientProtocolException e) {
//			System.out.println("Exception while pushing data to solr");
//			e.printStackTrace();
//		} catch (IOException e) {
//			System.out.println("Exception while pushing data to solr");
//			e.printStackTrace();
//		}
//		
//		post.get
		
	}

}
