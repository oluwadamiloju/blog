package africa.semicolon.blog.data.models;

import lombok.Data;

@Data
public class Comment extends Storable{
    private Integer id;
    private Integer postId;
    private String comment;
    private String commentAuthor;
}
