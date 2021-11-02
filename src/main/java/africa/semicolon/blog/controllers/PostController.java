package africa.semicolon.blog.controllers;

import africa.semicolon.blog.dto.requests.CreatePostRequest;
import africa.semicolon.blog.dto.responses.CreatePostResponse;
import africa.semicolon.blog.services.PostService;
import africa.semicolon.blog.services.PostServiceImpl;

public class PostController {
    private final PostService postService = (PostService) new PostServiceImpl();

    public CreatePostResponse addPost(CreatePostRequest createPostRequest) {
        return postService.addPost(createPostRequest);
    }
}
