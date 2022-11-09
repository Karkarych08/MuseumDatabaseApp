package university.app.dao;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class artistDAO {
    private Integer id;
    String firstname;
    String secondname;
    String familyname;
    Date dateofbirth;
    String country;
    Date dateofdeath;
}
