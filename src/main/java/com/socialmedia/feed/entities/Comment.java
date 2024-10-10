package com.socialmedia.feed.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentId;
    private Date commentdate;
    private String comment;
    @ManyToOne
    @JoinColumn(name = "user_id" )
    private User user;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

}
