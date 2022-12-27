package university.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import university.app.Services.Exceptions.LocaleNotSupportedException;
import university.app.Services.Massage_localization;
import university.app.Services.UserInterface;
import university.app.Services.artistService;
import university.app.dao.artistDAO;

import java.sql.SQLException;
import java.util.Collection;

@ComponentScan
public class App {
    public static void main(String[] args) throws SQLException, LocaleNotSupportedException {
        UserInterface userInterface = new UserInterface();
        userInterface.StartInterface();
    }
}