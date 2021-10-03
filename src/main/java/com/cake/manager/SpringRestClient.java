package com.cake.manager;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.cake.manager.model.Cake;

public class SpringRestClient {

	@Value("${rest.client.baseUrl}")
	private String BASE_URL;

	@Value("${rest.client.endpoint}")
	private String ENDPOINT_URL;

	private String CAKES_ENDPOINT_URL = BASE_URL + ENDPOINT_URL;
	private RestTemplate restTemplate = new RestTemplate();

	public static void main(String[] args) {
		SpringRestClient springRestClient = new SpringRestClient();
		// Step1: get all cakes
		springRestClient.getCakes();

		// Step2: first create a new cake
		springRestClient.createCake();

	}

	private void getCakes() {

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<String> result = restTemplate.exchange(CAKES_ENDPOINT_URL, HttpMethod.GET, entity,
				String.class);

		System.out.println(result);
	}

	private void createCake() {

		Cake newCake = new Cake("Black Forest", 100, 5);

		RestTemplate restTemplate = new RestTemplate();
		Cake result = restTemplate.postForObject(CAKES_ENDPOINT_URL, newCake, Cake.class);

		System.out.println(result);
	}

}
