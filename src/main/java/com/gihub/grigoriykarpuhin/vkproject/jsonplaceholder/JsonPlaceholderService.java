package com.gihub.grigoriykarpuhin.vkproject.jsonplaceholder;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JsonPlaceholderService {
    private final RestTemplate restTemplate;

    public JsonPlaceholderService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<String> get(String url, Long id) {
        return restTemplate.getForEntity(url + "/" + id, String.class);
    }

    public void create(String url, String item) {
        restTemplate.postForEntity(url, item, String.class);
    }

    public void update(String url, Long id, String item) {
        restTemplate.put(url + "/" + id, item);
    }

    public void delete(String url, Long id) {
        restTemplate.delete(url + "/" + id);
    }
}