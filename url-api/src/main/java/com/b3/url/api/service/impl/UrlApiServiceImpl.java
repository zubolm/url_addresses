package com.b3.url.api.service.impl;

import com.b3.url.api.configuration.KafkaTopicConfiguration;
import com.b3.url.api.model.UrlAddressMessage;
import com.b3.url.api.request.UrlRequest;
import com.b3.url.api.service.UrlApiService;
import com.b3.url.api.util.mapper.UrlAddressMapper;
import com.b3.url.api.util.validator.UrlAddressValidator;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@AllArgsConstructor
@Service
public class UrlApiServiceImpl implements UrlApiService {

    private final UrlAddressValidator validator;
    private final UrlAddressMapper mapper;
    private final KafkaTopicConfiguration kafkaTopic;
    private final KafkaTemplate<String, UrlAddressMessage> kafkaTemplate;

    @Override
    public void pushUrlAddressOnQueue(UrlRequest request) {

        validator.isValidURL(request.getUrlAddress());
        UrlAddressMessage message = mapper.mapToMessage(request);
        kafkaTemplate.send(kafkaTopic.getUrlTopic(), message);
        log.info("Sent message on queue {}", message.toString());
    }
}
