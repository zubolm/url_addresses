package com.b3.url.api.controller;

import com.b3.url.api.request.UrlRequest;
import com.b3.url.api.service.UrlApiService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("api/v1/url")
public class UrlController {

    private final UrlApiService urlApiService;

    @PostMapping()
    public void saveUrlAddress(@RequestBody UrlRequest request) {
        log.info("Received request: [url={}]", request.getUrlAddress());
        urlApiService.pushUrlAddressOnQueue(request);
    }


}
