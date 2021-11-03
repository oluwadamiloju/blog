package africa.semicolon.blog.data.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class Post extends Storable{

    private Integer id; //integer because we don't plan on the blog being large
    private String title;
    private LocalDateTime timePosted;
    private String body;
    private List<Comment> comments = new ArrayList<>();
}
