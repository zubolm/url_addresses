package com.b3.url.core.listener;

import com.b3.url.core.request.UrlAddressMessage;
import com.b3.url.core.service.UrlAddressService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@AllArgsConstructor
@Component
public class UrlAddressListener {

    private final UrlAddressService urlAddressService;

    @KafkaListener(topics = "${kafka.topic.name.urlTopic}", groupId = "${spring.kafka.consumer.group-id}")
    private void listenForUrlAddress(UrlAddressMessage message) {
        log.info("Received event from Kafka queue: [{}] ", message.toString());
        urlAddressService.saveUrlAddress(message);
    }


}
