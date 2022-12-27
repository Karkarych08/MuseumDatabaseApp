package university.app.Services;

import org.springframework.stereotype.Service;
import university.app.Interfaces.Locale_If;
import university.app.Services.Exceptions.LocaleNotSupportedException;

import java.util.Locale;
import java.util.Map;
@Service
public class LocaleIfService implements Locale_If {

    private final static Map<String, java.util.Locale> SUPPORTED = Map.of(
            "en", java.util.Locale.forLanguageTag("en")
    );

    private Locale current = SUPPORTED.get("en");

    @Override
    public void set(String locale) throws LocaleNotSupportedException {
        var loc = SUPPORTED.get(locale);
        if (loc == null)
            throw new LocaleNotSupportedException("locale-not-supported", locale);
        current = loc;

    }

    @Override
    public java.util.Locale get() {
        return current;
    }
}
