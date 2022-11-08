package com.b3.url.core.util.validator;

import com.b3.url.core.exception.UrlAddressNotValidException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

@Slf4j
@Component
public class UrlAddressValidator {

    public void isValidURL(String url) {
        try {
            new URL(url).toURI();
            log.info("Url address [{}] validated.", url);
        } catch (MalformedURLException | URISyntaxException e) {
            log.info("Url address [{}] not validated.", url);
            throw new UrlAddressNotValidException();
        }
    }
}
