package com.b3.url.api.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.apache.kafka.common.serialization.Serializer;

public class UrlAddressMessageSerializer implements Serializer<UrlAddressMessage> {

    ObjectMapper mapper = JsonMapper.builder()
            .findAndAddModules()
            .build();

    @Override
    public byte[] serialize(String s, UrlAddressMessage urlAddressMessage) {
        try {
            return mapper.writeValueAsBytes(urlAddressMessage);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
