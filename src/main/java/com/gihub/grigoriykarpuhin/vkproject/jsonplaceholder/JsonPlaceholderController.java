package com.gihub.grigoriykarpuhin.vkproject.jsonplaceholder;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class JsonPlaceholderController {
    private final JsonPlaceholderService jsonPlaceholderService;

    @GetMapping("{url}/{id}")
    public ResponseEntity<String> get(@PathVariable String url, @PathVariable Long id) {
        return jsonPlaceholderService.get(url, id);
    }

    @PostMapping("{url}")
    public void create(@PathVariable String url, @RequestBody String item) {
        jsonPlaceholderService.create(url, item);
    }

    @PutMapping("{url}/{id}")
    public void update(@PathVariable String url, @PathVariable Long id, @RequestBody String item) {
        jsonPlaceholderService.update(url, id, item);
    }

    @DeleteMapping("{url}/{id}")
    public void delete(@PathVariable String url, @PathVariable Long id) {
        jsonPlaceholderService.delete(url, id);
    }
}
