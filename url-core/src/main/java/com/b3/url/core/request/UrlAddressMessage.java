package com.b3.url.core.request;

import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@Getter
@ToString
public class UrlAddressMessage {

    private String url;
    private Date createdDate;

}
