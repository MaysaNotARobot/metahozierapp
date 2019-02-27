package app.metahozierservice.controller;

import app.metahozierservice.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceController {

    @Autowired
    Service service;

    @GetMapping("/get_song/{songName}")
    public ResponseEntity<String> getSong(@PathVariable String songName) {
        String song = service.getSong(songName);
        return ResponseEntity.ok(song);
    }

    @GetMapping("/get_songs/{albumName}")
    public ResponseEntity<List<String>> getSongs(@PathVariable String albumName) {
        List<String> songs = service.getSongs(albumName);
        return ResponseEntity.ok(songs);
    }
}
