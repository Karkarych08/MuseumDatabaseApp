package university.app.Interfaces;

import java.sql.SQLException;

public interface artist {

   Object findAllartist() throws SQLException;

    Object findartist(Integer id);
}
