package com.gihub.grigoriykarpuhin.vkproject;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JsonPlaceholderService {
    private final RestTemplate restTemplate;
    private static final String JSONPLACEHOLDER_API_URL = "https://jsonplaceholder.typicode.com";

    public JsonPlaceholderService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getPosts() {
        ResponseEntity<String> response = restTemplate.getForEntity(JSONPLACEHOLDER_API_URL + "/posts", String.class);
        return response.getBody();
    }

    public String getPost(int id) {
        ResponseEntity<String> response = restTemplate.getForEntity(JSONPLACEHOLDER_API_URL + "/posts/" + id, String.class);
        return response.getBody();
    }
}
