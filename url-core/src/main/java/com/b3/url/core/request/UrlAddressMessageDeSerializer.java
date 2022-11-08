package com.b3.url.core.request;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.IOException;

public class UrlAddressMessageDeSerializer implements Deserializer<UrlAddressMessage> {

    ObjectMapper mapper = JsonMapper.builder()
            .findAndAddModules()
            .build();

    @Override
    public UrlAddressMessage deserialize(String s, byte[] bytes) {

        try {
            return mapper.readValue(bytes, UrlAddressMessage.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
