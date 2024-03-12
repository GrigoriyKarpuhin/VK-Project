package com.gihub.grigoriykarpuhin.vkproject.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("albums")
public class AlbumController extends AbstractController {
    public AlbumController(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    protected String getBaseUrl() {
        return "https://jsonplaceholder.typicode.com/albums";
    }
}
