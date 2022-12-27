package university.app.Services;

import lombok.RequiredArgsConstructor;
import university.app.Interfaces.artist;

import org.springframework.stereotype.Service;

import university.app.dao.artistDAO;
import university.app.repositoty.artistRepositoryImpl;

import java.sql.SQLException;
import java.util.Collection;

@Service
@RequiredArgsConstructor
public class artistService implements artist {

    private final artistRepositoryImpl aRep;

    @Override
    public Collection<artistDAO> findAllartist() throws SQLException {

        return aRep.findAll();
    }

    public Collection<artistDAO> findAllartistbycountry(String country) throws SQLException {

        return aRep.findAllByCountry(country);
    }

    @Override
    public Collection<artistDAO> findartist(Integer id) {
        return null;
    }
}
