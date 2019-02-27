package app.metahozierservice.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * JPA repository to store songs
 */
@Repository
public interface SongRepository extends JpaRepository<Song, Long> {

    /**
     * Method to be find songs by given album. To be used from screen impl.
     * @param album to be used for filtering.
     * @return List<Song> to be sent to screen
     */
    List<Song> findByAlbum(String album);

    /**
     * Method to be find song by given name. To be used from screen impl.
     * @param name to be used for filtering.
     * @return Song to be sent to screen
     */
    Song findByName(String name);

}
