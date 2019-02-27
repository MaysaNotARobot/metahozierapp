package app.metahozierservice;

import app.metahozierservice.data.Song;
import app.metahozierservice.data.SongRepository;
import org.junit.After;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;

import static app.metahozierservice.data.ConstantLyrics.*;
import static app.metahozierservice.data.ConstantLyrics.DO_I_WANNA_KNOW;

public class TestBase {

    @Autowired
    SongRepository songRepository;

    protected void createData() {
        songRepository.findAll().forEach(song -> songRepository.delete(song));

        songRepository.save(new Song(OTHER_SONGS, "Better Love", BETTER_LOVE));
        songRepository.save(new Song(ALBUM_HOZIER, "Take Me to Church", TAKE_ME_TO_CHURCH));
        songRepository.save(new Song(ALBUM_HOZIER, "Cherry wine", CHERRY_WINE));
        songRepository.save(new Song(ALBUM_HOZIER, "From Eden", FROM_EDEN));
        songRepository.save(new Song(OTHER_SONGS, "Do I Wanna Know", DO_I_WANNA_KNOW));
    }

    protected void deleteData() {
        songRepository.findAll().forEach(song -> songRepository.delete(song));
    }
}
