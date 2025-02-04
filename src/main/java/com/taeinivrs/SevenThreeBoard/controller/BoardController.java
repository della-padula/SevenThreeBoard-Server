package com.taeinivrs.SevenThreeBoard.controller;

import com.taeinivrs.SevenThreeBoard.model.Post;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class BoardController {
    @GetMapping("/home")
    public List<Post> getPostList() {
        List<Post> posts = new ArrayList<Post>();
        posts.add(new Post(1, "Title1", "Content1"));
        posts.add(new Post(2, "Title2", "Content2"));
        posts.add(new Post(3, "Title3", "Content3"));

        return posts;
    }
    
}
