package com.nestorworks.clickstreamapplication.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaProducerTopicConfig {


    @Bean
    public NewTopic newTopic(){
        return TopicBuilder.name("click_topic")
                .partitions(2)
                .build();
    }
}
