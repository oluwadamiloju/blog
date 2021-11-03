package africa.semicolon.blog.utilities;

import africa.semicolon.blog.data.models.Comment;
import africa.semicolon.blog.data.models.Post;
import africa.semicolon.blog.dto.requests.AddCommentRequest;
import africa.semicolon.blog.dto.requests.CreatePostRequest;
import africa.semicolon.blog.dto.responses.CreatePostResponse;
import africa.semicolon.blog.dto.responses.FindPostResponse;

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

    public static FindPostResponse mapFindPostResponse(Post post) {
        FindPostResponse findPostResponse = new FindPostResponse();
        findPostResponse.setBody(post.getBody());
        findPostResponse.setTitle(post.getTitle());
        findPostResponse.setComments(post.getComments());
        findPostResponse.setDatePublished(post.getTimePosted());
        return findPostResponse;
    }

    public static Comment map(AddCommentRequest addCommentRequest){
        Comment comment = new Comment ();
        comment.setComment(addCommentRequest.getComment());
        comment.setPostId(addCommentRequest.getId());
        comment.setId(addCommentRequest.getId());
        comment.setTime(LocalDateTime.now());
        comment.setCommentAuthor( addCommentRequest.getCommentAuthor());
        return comment;
    }
}
