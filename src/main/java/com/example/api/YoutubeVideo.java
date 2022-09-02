package com.example.api;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "video")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class YoutubeVideo {

    @Id
    private String videoId;

    @Column(name = "creator")
    private String creator;

    @Column(name = "title")
    private String title;

    @Column(name = "views")
    private int views;

    @Column(name = "datePosted")
    private LocalDate datePosted;

    @Column(name = "likes")
    private int likes;

    @Column(name = "description")
    private String description;

    @OneToMany(targetEntity = YoutubeVideoComment.class)
    private List<YoutubeVideoComment> commentSection;
}
