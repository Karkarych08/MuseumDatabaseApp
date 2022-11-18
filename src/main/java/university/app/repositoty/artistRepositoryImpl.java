package university.app.repositoty;


import org.springframework.stereotype.Repository;
import university.app.Interfaces.artistRepository;
import university.app.Services.JDBConnect;
import university.app.dao.artistDAO;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


@Repository
public class artistRepositoryImpl implements artistRepository {

    JDBConnect jdbConnect = new JDBConnect();

    Statement statement = jdbConnect.getStatement();

    public artistRepositoryImpl() throws SQLException {
    }


    @Override
    public void insert(artistDAO artist) {

    }

    @Override
    public void update(artistDAO artist) {

    }

    @Override
    public Collection<artistDAO> findOlderThenDate(Date date) {
        return null;
    }

    @Override
    public Collection<artistDAO> findAll() throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT * FROM artist");
        ArrayList<artistDAO> artists = new ArrayList<>();
        while (resultSet.next()){
            artistDAO artist = new artistDAO(
                    resultSet.getInt("id"),
                    resultSet.getString("firstname"),
                    resultSet.getString("secondname"),
                    resultSet.getString("familyname"),
                    resultSet.getDate("dateofbirth"),
                    resultSet.getString("country"),
                    resultSet.getDate("dateofdeath"));
            artists.add(artist);
        }
        return artists;
    }

    @Override
    public Collection<artistDAO> findAllByCountry(String country) {
        return null;
    }

    @Override
    public Optional<artistDAO> findById(long id) {
        return Optional.empty();
    }
}
