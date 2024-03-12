package com.gihub.grigoriykarpuhin.vkproject.post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("/{id}")
    public Post findPost(@PathVariable Long id) {
        return postService.findPost(id);
    }

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        postService.createPost(post);
        return post;
    }
}
