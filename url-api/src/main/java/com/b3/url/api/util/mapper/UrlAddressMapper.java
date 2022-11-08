package com.b3.url.api.util.mapper;

import com.b3.url.api.model.UrlAddressMessage;
import com.b3.url.api.request.UrlRequest;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UrlAddressMapper {

    public UrlAddressMessage mapToMessage(UrlRequest request) {
        return UrlAddressMessage.builder()
                .url(request.getUrlAddress())
                .createdDate(new Date())
                .build();
    }
}
