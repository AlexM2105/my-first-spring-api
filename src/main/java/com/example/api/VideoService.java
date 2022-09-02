package com.example.api;

import java.util.List;

public interface VideoService {

    YoutubeVideo getVideoById(String videoId);

    YoutubeVideo createVideo(YoutubeVideo video);

    List<YoutubeVideo> getFeed();

}
