package com.gihub.grigoriykarpuhin.vkproject;

import com.gihub.grigoriykarpuhin.vkproject.post.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonPlaceholderController {
    private final PostRepository postRepository;

    public JsonPlaceholderController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @PostMapping("/posts")
    public Post savePost(@RequestBody Post post) {
        return postRepository.save(post);
    }
}
