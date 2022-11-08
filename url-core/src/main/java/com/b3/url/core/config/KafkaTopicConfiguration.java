package com.b3.url.core.config;

import lombok.Getter;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Getter
@Configuration
public class KafkaTopicConfiguration {

    @Value("${kafka.topic.name.urlTopic}")
    private String urlTopic;

    @Value("${kafka.topic.partitions}")
    private Integer partitions;

    @Value("${kafka.topic.replicas}")
    private Integer replicas;


    @Bean
    NewTopic chatTopic() {
        return TopicBuilder
                .name(urlTopic)
                .partitions(partitions)
                .replicas(replicas)
                .build();
    }

}
