package app.metahozierservice;

import app.metahozierservice.data.Song;
import app.metahozierservice.data.SongRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static app.metahozierservice.data.ConstantLyrics.*;

@SpringBootApplication
@EnableAutoConfiguration
public class MetaHozierServiceApplication {

    /**
     * Application entry point
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(MetaHozierServiceApplication.class, args);
    }

    /**
     * Method being invoked when application is loaded. Persists data to SongRepository
     * @param songRepository
     * @return CommandLineRunner
     */
    @Bean
    public CommandLineRunner loadData(SongRepository songRepository) {
        return args -> {
            songRepository.save(new Song(OTHER_SONGS, "Better Love", BETTER_LOVE));
            songRepository.save(new Song(ALBUM_HOZIER, "Take me to Church", TAKE_ME_TO_CHURCH));
            songRepository.save(new Song(ALBUM_HOZIER, "Cherry wine", CHERRY_WINE));
            songRepository.save(new Song(ALBUM_HOZIER, "From Eden", FROM_EDEN));
            songRepository.save(new Song(OTHER_SONGS, "Do I Wanna Know", DO_I_WANNA_KNOW));
        };
    }
}
