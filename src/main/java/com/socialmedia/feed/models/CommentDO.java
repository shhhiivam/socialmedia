package com.socialmedia.feed.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentDO {
    private String comment;
    private Integer userId;
    private Integer postId;
}
