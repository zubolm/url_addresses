package com.b3.url.api.model;

import lombok.*;

import java.util.Date;

@ToString
@Builder
@Getter
@Setter
public class UrlAddressMessage {

    private String url;
    private Date createdDate;

}
