package com.b3.url.core.util.mapper;

import com.b3.url.core.model.UrlAddress;
import com.b3.url.core.request.UrlAddressMessage;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class UrlAddressMapper {

    public UrlAddress mapToEntity(UrlAddressMessage message) {

        UrlAddress urlAddress = new UrlAddress();
        urlAddress.setUrl(message.getUrl());
        urlAddress.setCreatedDate(new Date());
        return urlAddress;
    }
}
