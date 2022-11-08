package com.b3.url.api.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

@Getter
public class UrlRequest {

    @ApiModelProperty(required = true)
    private String urlAddress;
}
