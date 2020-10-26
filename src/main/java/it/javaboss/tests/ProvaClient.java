package it.javaboss.tests;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

public class ProvaClient {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		
		final String uri = "http://localhost:8090/colors_be/saveColor";
		
		String color="giallo";
		JSONObject bodyJson=new JSONObject();
		bodyJson.put("color", color);
		HttpEntity<String> request = new HttpEntity<String>(bodyJson.toString());
		Object result = restTemplate.postForEntity( uri, request, String.class);
		
		System.out.println(result);

	}

}
