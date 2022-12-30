package university.app;

import org.springframework.context.annotation.ComponentScan;
import university.app.Services.Exceptions.LocaleNotSupportedException;
import university.app.Services.UserInterface;

import java.sql.SQLException;

@ComponentScan
public class App {
    public static void main(String[] args) throws SQLException, LocaleNotSupportedException {
        UserInterface userInterface = new UserInterface();
        userInterface.StartInterface();
    }
}