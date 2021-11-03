package africa.semicolon.blog.data.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Comment extends Storable{
    private Integer id;
    private Integer postId;
    private String comment;
    private String commentAuthor;
    private LocalDateTime time;
}
