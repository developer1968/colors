package it.javaboss.service;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ColorsService {
	public String getColor() {
		//call the BE REST for get the color
		
	    final String uri = "http://localhost:8090/colors_be/getColor";
	    
	    //TODO: Autowire the RestTemplate in all the examples
	    RestTemplate restTemplate = new RestTemplate();
	 
	    String result = restTemplate.getForObject(uri, String.class);
	    System.out.println(result);
	    return result;
	    
	}
	
	
	public void saveColor(String color) {
		RestTemplate restTemplate = new RestTemplate();
		
		final String uri = "http://localhost:8090/colors_be/saveColor";
		
		JSONObject bodyJson=new JSONObject();
		bodyJson.put("color", color);
		HttpEntity<String> request = new HttpEntity<String>(bodyJson.toString());
		Object result = restTemplate.postForEntity( uri, request, String.class);
		
		System.out.println(result);
	   
	}
}
