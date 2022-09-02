package com.example.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/videos")
@RequiredArgsConstructor
public class YoutubeVideoController {

    private final VideoService videoService;

    @GetMapping("/by/{id}")
    public YoutubeVideo getYoutubeVideoById(@PathVariable("id") String videoId) {
        return videoService.getVideoById(videoId);
    }

    @PostMapping("/save")
    public YoutubeVideo postNewYoutubeVideo(@RequestBody YoutubeVideo video) {
        return videoService.createVideo(video);
    }

    @GetMapping("/feed")
    public List<YoutubeVideo> getYoutubeFeed() {
        return videoService.getFeed();
    }

}
