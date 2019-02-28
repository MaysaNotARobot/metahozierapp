package app.metahozierservice.controller;

import app.metahozierservice.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Service Controller that handles all the requests.
 */
@RestController
public class ServiceController {

    @Autowired
    Service service;

    /**
     * Method to handle get request for song's lyrics.
     * @param songName to be used for filtering.
     * @return ResponseEntity<String> containing song's lyrics
     */
    @GetMapping("/get_song/{songName}")
    public ResponseEntity<String> getSong(@PathVariable String songName) {
        String song = service.getSong(songName);
        return ResponseEntity.ok(song);
    }

    /**
     * Method to handle get request for songs from specified album.
     * @param albumName to be used for filtering.
     * @return ResponseEntity<List<String>> containing songs' names
     */
    @GetMapping("/get_songs/{albumName}")
    public ResponseEntity<List<String>> getSongs(@PathVariable String albumName) {
        List<String> songs = service.getSongs(albumName);
        return ResponseEntity.ok(songs);
    }
}
