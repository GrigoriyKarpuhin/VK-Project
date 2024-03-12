package com.gihub.grigoriykarpuhin.vkproject.post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public Post findPost(Long id) {
        return postRepository.findById(id).orElseThrow();
    }

    public void createPost(Post post) {
        postRepository.save(post);
    }
}
