package com.b3.url.api.service;

import com.b3.url.api.request.UrlRequest;

public interface UrlApiService {

    void pushUrlAddressOnQueue(UrlRequest request);
}
