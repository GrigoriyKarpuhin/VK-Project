package com.gihub.grigoriykarpuhin.vkproject.album;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/albums")
@RequiredArgsConstructor
public class AlbumController {
    private final AlbumService albumService;

    @GetMapping("/{id}")
    public Album findAlbum(@PathVariable Long id) {
        return albumService.findAlbum(id);
    }

    @PostMapping
    public Album createAlbum(@RequestBody Album album) {
        albumService.createAlbum(album);
        return album;
    }
}
