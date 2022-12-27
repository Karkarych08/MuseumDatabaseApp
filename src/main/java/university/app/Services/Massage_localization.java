package university.app.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import university.app.Interfaces.Message;

@Service
@RequiredArgsConstructor
public class Massage_localization implements Message {
    private final MessageSource messageSource;
    private final LocaleIfService currentLocaleService;


    @Override
    public String localize(String code, Object... params) {
        return messageSource.getMessage(code, params, currentLocaleService.get());
    }
}
