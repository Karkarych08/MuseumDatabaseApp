package university.app.Services;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import university.app.App;
import university.app.Interfaces.Locale_If;
import university.app.Services.Exceptions.LocaleNotSupportedException;

import java.sql.SQLException;
import java.util.Scanner;

@ComponentScan
public class UserInterface {

    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
    artistService aserv = ctx.getBean(artistService.class);
    Massage_localization message = ctx.getBean(university.app.Services.Massage_localization.class);
    Locale_If locale = ctx.getBean(Locale_If.class);
    Scanner in = new Scanner(System.in);

    public void StartInterface() throws LocaleNotSupportedException, SQLException {
        boolean working = true;
        System.out.print("Choose your language (en): ");
        locale.set(in.next().toLowerCase());
        System.out.println(message.localize("welcomeMSG"));
        while (working){
            System.out.print(message.localize("startMENU"));
            switch (in.next().toLowerCase()){
                case "0"-> working = false;
                case "findall" -> System.out.println(aserv.findAllartist().toString());
                case "findby" -> {

                    String country = in.next();
                    System.out.println(aserv.findAllartistbycountry(country));
                }
            }
        }
    }
}
