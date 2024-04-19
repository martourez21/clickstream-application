package com.nestorworks.clickstreamapplication.service;

import com.nestorworks.clickstreamapplication.record.Message;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class ClickStreamServiceTest {

    private final static Message message = new Message().builder()
            .name("Nestor")
            .greeting("Hello!...Good morning")
            .build();

//    @BeforeAll
//    static void setMessage(){
//      message.builder()
//               .name("Nestor")
//               .greeting("Hello!...Good morning")
//               .build();
//    }

    @Test
    public void testing_the_greeting_string() {
        log.info("Testing the greetings endpoint...");
        assertEquals("Hello!...Good morning", message.getGreeting());
    }

}