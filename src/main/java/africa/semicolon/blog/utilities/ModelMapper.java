package africa.semicolon.blog.utilities;

import africa.semicolon.blog.data.models.Post;
import africa.semicolon.blog.dto.requests.CreatePostRequest;
import africa.semicolon.blog.dto.responses.CreatePostResponse;

import java.time.LocalDateTime;

public class ModelMapper {
    public static Post map(CreatePostRequest createPostRequest) {
        Post post = new Post();
        post.setBody(createPostRequest.getBody());
        post.setTitle(createPostRequest.getTitle());
        post.setTimePosted(LocalDateTime.now());
        return post;
    }

    public static CreatePostResponse map(Post post) {
        CreatePostResponse createPostResponse = new CreatePostResponse();
        createPostResponse.setId(post.getId());
        createPostResponse.setTitle(post.getTitle());
        return createPostResponse;
    }
}
