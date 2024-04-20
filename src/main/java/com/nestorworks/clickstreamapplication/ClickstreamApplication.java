package com.nestorworks.clickstreamapplication;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
