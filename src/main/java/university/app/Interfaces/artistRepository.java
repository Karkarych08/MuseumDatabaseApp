package university.app.Interfaces;

import university.app.dao.artistDAO;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;

public interface artistRepository {
    void insert(artistDAO artist);
    void update(artistDAO artist);
    Collection<artistDAO> findOlderThenDate(Date date);
    Collection<artistDAO> findAll() throws SQLException;
    Collection<artistDAO> findAllByCountry(String country) throws SQLException;
    Optional<artistDAO> findById(long id);
}
