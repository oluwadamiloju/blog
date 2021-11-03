package africa.semicolon.blog.services;

import africa.semicolon.blog.data.models.Post;
import africa.semicolon.blog.dto.requests.AddCommentRequest;
import africa.semicolon.blog.dto.requests.CreatePostRequest;
import africa.semicolon.blog.dto.responses.CreatePostResponse;
import africa.semicolon.blog.dto.responses.FindPostResponse;

import java.util.List;

public interface PostService {
    CreatePostResponse addPost(CreatePostRequest createPostRequest);
    FindPostResponse findPostById(Integer id);
    CreatePostResponse addComment(AddCommentRequest addCommentRequest);
    void deletePostById(Integer id);
    List<Post> findAll();
}
