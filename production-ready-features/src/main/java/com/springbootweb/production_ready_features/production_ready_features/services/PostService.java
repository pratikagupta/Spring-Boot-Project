package com.springbootweb.production_ready_features.production_ready_features.services;

import com.springbootweb.production_ready_features.production_ready_features.DTO.PostDTO;

import java.util.List;


public interface PostService{

    List<PostDTO> getAllPosts();

    PostDTO createNewPost(PostDTO inputPost);

    PostDTO getPostById(Long postId);

    PostDTO updatePost(PostDTO inputPost, Long postId);
}
