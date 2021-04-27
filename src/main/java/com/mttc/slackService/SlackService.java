package com.mttc.slackService;

import java.io.IOException;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SlackService {
	
	 private static String slackWebhookUrl = "https://hooks.slack.com/services/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";
	  
     public static void sendMessage(SlackMessage message) {
         CloseableHttpClient client = HttpClients.createDefault();
         HttpPost httpPost = new HttpPost(slackWebhookUrl);
 
         try {
             ObjectMapper objectMapper = new ObjectMapper();
             String json = objectMapper.writeValueAsString(message);
 
             StringEntity entity = new StringEntity(json);
             httpPost.setEntity(entity);
             httpPost.setHeader("Accept", "application/json");
             httpPost.setHeader("Content-type", "application/json");
 
             client.execute(httpPost);
             client.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
     }

}
