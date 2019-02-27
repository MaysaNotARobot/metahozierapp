package app.metahozierservice.service;

import app.metahozierservice.data.Song;
import app.metahozierservice.data.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    SongRepository songRepository;

    public String getSong(String songName) {
        return songRepository.findByName(songName).getLyrics();
    }

    public List<String> getSongs(String albumName) {
        return songRepository.findByAlbum(albumName)
                .stream()
                .map(Song::getName)
                .collect(Collectors.toList());
    }
}
