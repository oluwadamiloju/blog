package africa.semicolon.blog.services;

import africa.semicolon.blog.dto.requests.CreatePostRequest;
import africa.semicolon.blog.dto.responses.CreatePostResponse;

public interface PostService {
    CreatePostResponse addPost(CreatePostRequest createPostRequest);
}
