package Internationalization.I18NinSpringBoot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import java.util.Locale;

import java.util.Locale;

@RestController
public class LocaleI18NController {
    private final MessageSource messageSource;

    @Autowired
    public LocaleI18NController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping("/api/greet/{username}")
    public String greet(@PathVariable String username,
                        @RequestHeader(name = "Accept-Language", required = false) Locale locale) {

        return messageSource.getMessage("greeting.message", new Object[]{username}, locale);

    }
}
