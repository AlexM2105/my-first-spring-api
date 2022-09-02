package com.example.api;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VideoServiceImpl implements VideoService {

    private final VideoRepository videoRepository;

    @Override
    public YoutubeVideo getVideoById(String videoId) {
        return videoRepository.findById(videoId).orElseThrow();
    }

    @Override
    public YoutubeVideo createVideo(YoutubeVideo video) {
        return videoRepository.save(video);
    }

    @Override
    public List<YoutubeVideo> getFeed() {
        return videoRepository.findAll();
    }
}
