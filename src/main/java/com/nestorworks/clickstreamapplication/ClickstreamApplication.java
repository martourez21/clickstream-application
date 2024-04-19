package com.nestorworks.clickstreamapplication;

import com.nestorworks.clickstreamapplication.record.ClickStreamRecord;
import com.nestorworks.clickstreamapplication.service.ClickStreamService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

@SpringBootApplication
@Slf4j
@RequiredArgsConstructor
public class ClickstreamApplication {

	//private static final ClickStreamService clickStreamService;

	public static void main(String[] args) {
		SpringApplication.run(ClickstreamApplication.class, args);



		//clickStreamService.sendMessage(clickStreamRecord);
	}


}
