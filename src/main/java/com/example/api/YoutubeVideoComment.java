package com.example.api;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class YoutubeVideoComment {

    @Id
    private String commentId;

    @Column(name = "username")
    private String username;

    @Column(name = "likes")
    private int likes;

    @Column(name = "message")
    private String message;

//    @OneTOdd
//    private List<YoutubeVideoComment> replies;

}
