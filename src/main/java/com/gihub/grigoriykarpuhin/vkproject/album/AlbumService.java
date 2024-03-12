package com.gihub.grigoriykarpuhin.vkproject.album;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlbumService {
    private final AlbumRepository albumRepository;

    public Album findAlbum(Long id) {
        return albumRepository.findById(id).orElseThrow();
    }

    public void createAlbum(Album album) {
        albumRepository.save(album);
    }
}
