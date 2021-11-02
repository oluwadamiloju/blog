package africa.semicolon.blog.services;

import africa.semicolon.blog.data.models.Post;
import africa.semicolon.blog.data.repositories.PostRepository;
import africa.semicolon.blog.data.repositories.Repository;
import africa.semicolon.blog.dto.requests.CreatePostRequest;
import africa.semicolon.blog.dto.responses.CreatePostResponse;
import africa.semicolon.blog.utilities.ModelMapper;

public class PostServiceImpl implements PostService{
    private final PostRepository repository = new PostRepository();

    @Override
    public CreatePostResponse addPost(CreatePostRequest createPostRequest) {
        Post post = ModelMapper.map(createPostRequest);
        return ModelMapper.map(repository.save(post));
    }
}
