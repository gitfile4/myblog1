package com.myblog.myblog1.service;


import com.myblog.myblog1.payload.PostDto;
import org.springframework.stereotype.Service;


public interface PostService {

    PostDto createPost(PostDto postDto);
}
