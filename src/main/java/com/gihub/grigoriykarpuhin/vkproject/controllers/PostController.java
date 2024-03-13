package com.gihub.grigoriykarpuhin.vkproject.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("posts")
public class PostController extends AbstractModelsController {
    public PostController(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    protected String getBaseUrl() {
        return "https://jsonplaceholder.typicode.com/posts";
    }
}
