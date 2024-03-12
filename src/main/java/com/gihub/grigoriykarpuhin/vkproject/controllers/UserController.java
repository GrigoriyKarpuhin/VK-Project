package com.gihub.grigoriykarpuhin.vkproject.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("users")
public class UserController extends AbstractController {
    public UserController(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    protected String getBaseUrl() {
        return "https://jsonplaceholder.typicode.com/users";
    }
}
