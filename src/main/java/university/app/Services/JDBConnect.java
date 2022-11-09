package university.app.Services;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@Component
public class JDBConnect {
    Connection connection;
    @Getter
    Statement statement;

    public JDBConnect(String url, String username,String password) throws SQLException {
        this.connection = DriverManager.getConnection(url,username,password);
        this.statement = connection.createStatement();
    }

}