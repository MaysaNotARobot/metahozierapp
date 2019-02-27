package app.metahozierservice.data;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Class to represent Song with fields :
 * id, album, lyrics.
 */
@Entity
public class Song {

    @Id
    @GeneratedValue
    private Long id;

    private String album;
    private String name;

    @Column(length = 4000)
    private String lyrics;

    public Song(String album, String name, String lyrics){
        this.album = album;
        this.name = name;
        this.lyrics = lyrics;
    }

    public Song() {}

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getAlbum() { return album; }

    public void setAlbum(String album) { this.album = album; }

    public String getLyrics() { return lyrics; }

    public void setLyrics(String lyrics) { this.lyrics = lyrics; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}
