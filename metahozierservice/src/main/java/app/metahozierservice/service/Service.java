package app.metahozierservice.service;

import app.metahozierservice.data.Song;
import app.metahozierservice.data.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Class to provide main service
 */
@org.springframework.stereotype.Service
public class Service {

    @Autowired
    SongRepository songRepository;

    /**
     * Method to be find song lyrics by given name.
     * @param songName to be used for filtering.
     * @return String song lyrics.
     */
    public String getSong(String songName) {
        return songRepository.findByName(songName).getLyrics();
    }

    /**
     * Method to find songs' names by given album.
     * @param albumName to be used for filtering.
     * @return List<String> songs' names.
     */
    public List<String> getSongs(String albumName) {
        return songRepository.findByAlbum(albumName)
                .stream()
                .map(Song::getName)
                .collect(Collectors.toList());
    }
}
