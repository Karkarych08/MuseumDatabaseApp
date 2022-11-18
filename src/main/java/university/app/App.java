package university.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import university.app.Services.artistService;
import university.app.dao.artistDAO;

import java.sql.SQLException;
import java.util.Collection;

@ComponentScan
public class App {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
        artistService aserv = ctx.getBean(artistService.class);
        Collection<artistDAO> artists =aserv.findAllartist();
        for (artistDAO a: artists) {
            System.out.println(a.toString());
        }
    }
}