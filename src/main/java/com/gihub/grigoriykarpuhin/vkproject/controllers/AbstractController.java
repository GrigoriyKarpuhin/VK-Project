package com.gihub.grigoriykarpuhin.vkproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
public abstract class AbstractController {
    protected final RestTemplate restTemplate;
    protected abstract String getBaseUrl();

    @GetMapping("/{id}")
    public ResponseEntity<String> getItem(@PathVariable Long id) {
        return restTemplate.getForEntity(getBaseUrl() + "/" + id, String.class);
    }

    @PostMapping
    public ResponseEntity<String> createItem(@RequestBody String item) {
        return restTemplate.postForEntity(getBaseUrl(), item, String.class);
    }

    @PutMapping("/{id}")
    public void updateItem(@PathVariable Long id, @RequestBody String item) {
        restTemplate.put(getBaseUrl() + "/" + id, item);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        restTemplate.delete(getBaseUrl() + "/" + id);
    }
}
