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
     * Method to find songs by given album.
     * @param album to be used for filtering.
     * @return List<Song>
     */
    List<Song> findByAlbum(String album);

    /**
     * Method to be find song by given name.
     * @param name to be used for filtering.
     * @return Song
     */
    Song findByName(String name);

}
