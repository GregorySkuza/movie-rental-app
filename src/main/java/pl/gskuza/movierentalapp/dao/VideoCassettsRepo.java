package pl.gskuza.movierentalapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.gskuza.movierentalapp.dao.entity.VideoCassette;

@Repository
public interface VideoCassettsRepo extends CrudRepository<VideoCassette, Long> {
}
