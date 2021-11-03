package africa.semicolon.blog.dto.requests;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AddCommentRequest {
    private Integer id;
    private String commentAuthor;
    private String comment;
    private LocalDateTime timeCommented;
}
