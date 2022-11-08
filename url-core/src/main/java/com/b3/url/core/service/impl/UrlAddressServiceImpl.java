package com.b3.url.core.service.impl;

import com.b3.url.core.model.UrlAddress;
import com.b3.url.core.repository.UrlAddressRepository;
import com.b3.url.core.request.UrlAddressMessage;
import com.b3.url.core.service.UrlAddressService;
import com.b3.url.core.util.mapper.UrlAddressMapper;
import com.b3.url.core.util.validator.UrlAddressValidator;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@AllArgsConstructor
@Service
public class UrlAddressServiceImpl implements UrlAddressService {

    private final UrlAddressValidator validator;
    private final UrlAddressMapper mapper;
    private final UrlAddressRepository repository;

    @Transactional
    @Override
    public void saveUrlAddress(UrlAddressMessage message) {

        validator.isValidURL(message.getUrl());
        UrlAddress urlAddress = mapper.mapToEntity(message);
        repository.save(urlAddress);
        log.info("Saved url address [{}] in database", urlAddress);
    }
}
