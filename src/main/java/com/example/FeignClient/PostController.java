package com.example.FeignClient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    private JsonPlaceholderClient jsonPlaceholderClient;

    @GetMapping("/posts/{id}")
    public Post getPost(@PathVariable Long id) {
        return jsonPlaceholderClient.getPostById(id);
    }
}
