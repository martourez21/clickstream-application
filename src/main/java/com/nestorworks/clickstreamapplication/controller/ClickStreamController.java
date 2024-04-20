package com.nestorworks.clickstreamapplication.controller;

import com.nestorworks.clickstreamapplication.ClickStreamService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/clicks")
@RestController
@RequiredArgsConstructor
@Slf4j
public class ClickStreamController {

    private final ClickStreamService clickStreamService;

    @GetMapping
    public ResponseEntity<String> sendClickEvent(){
        clickStreamService.sendEventToKafkaCluster();
        log.warn("Clicked event sent to Kafka Topic");

        return ResponseEntity.ok().body("Clicked Event Sent Successfully!");
    }

    @GetMapping("/sales")
    public ResponseEntity<String> sendSalesEvent(){
        clickStreamService.sendSalesEventToKafkaCluster();
        log.warn("Sales event sent to Kafka Topic");

        return ResponseEntity.ok().body("Sales Event Sent Successfully!");
    }

}
