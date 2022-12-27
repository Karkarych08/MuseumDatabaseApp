package university.app.repositoty;


import org.springframework.stereotype.Repository;
import university.app.Interfaces.artistRepository;
import university.app.Services.JDBConnect;
import university.app.dao.artistDAO;


import java.sql.*;
import java.util.*;
import java.util.Date;


@Repository
public class  artistRepositoryImpl implements artistRepository {

    JDBConnect jdbConnect = new JDBConnect();

    Connection connection = jdbConnect.getConnection();

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
        ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM artist");
        return getArtistDAOS(resultSet);
    }

    @Override
    public Collection<artistDAO> findAllByCountry(String country) throws SQLException {
        PreparedStatement prepareStatement = connection.prepareStatement("SELECT * FROM artist where country=?");
        prepareStatement.setString(1,country);
        ResultSet resultSet =  prepareStatement.executeQuery();
        return getArtistDAOS(resultSet);
    }

    private Collection<artistDAO> getArtistDAOS(ResultSet resultSet) throws SQLException {
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
    public Optional<artistDAO> findById(long id) {
        return Optional.empty();
    }
}
