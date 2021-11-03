package africa.semicolon.blog.controllers;

import africa.semicolon.blog.data.models.Post;
import africa.semicolon.blog.dto.requests.AddCommentRequest;
import africa.semicolon.blog.dto.requests.CreatePostRequest;
import africa.semicolon.blog.dto.responses.CreatePostResponse;
import africa.semicolon.blog.dto.responses.FindPostResponse;
import africa.semicolon.blog.services.PostService;
import africa.semicolon.blog.services.PostServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
    private final PostService postService = new PostServiceImpl();

    @PostMapping("/api/post")
    public CreatePostResponse addPost(CreatePostRequest createPostRequest) {
        return postService.addPost(createPostRequest);
    }

    @GetMapping("/api/post/{id}")
    public FindPostResponse findPostById(@PathVariable("id") Integer id) {
        return postService.findPostById(id);
    }

    @PostMapping("/api/comment")
    public CreatePostResponse addComment(@RequestBody AddCommentRequest addCommentRequest){
        return   postService.addComment(addCommentRequest);
    }

    @DeleteMapping("/api/post/{id}")
    public void deletePostById(@PathVariable Integer id){
        postService.deletePostById(id);
    }

    @GetMapping("/api/post")
    public List<Post> findAll() {
        return postService.findAll();
    }
}
