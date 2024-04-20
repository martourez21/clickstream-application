package com.nestorworks.clickstreamapplication;

import com.nestorworks.clickstreamapplication.record.ClickStreamRecord;
import com.nestorworks.productsales.ProductSales;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@RequiredArgsConstructor
public class ClickStreamService {


    private final NewTopic topic;

    private final KafkaTemplate<String, ClickStreamRecord> kafkaTemplate;

    private final KafkaTemplate<String, ProductSales> kafkaTemplate01;


    public void sendMessage(ClickStreamRecord clickStreamRecord){
        log.info("New ClickStreamRecord event sent => {}", clickStreamRecord);
        Message<ClickStreamRecord> message = MessageBuilder
                .withPayload(clickStreamRecord)
                .setHeader(KafkaHeaders.TOPIC, topic.name())
                .build();

        kafkaTemplate.send(message);
    }

    public void sendMessage01(ProductSales productSales){
        log.info("New ProductSales event sent => {}", productSales);
        Message<ProductSales> message = MessageBuilder
                .withPayload(productSales)
                .setHeader(KafkaHeaders.TOPIC, "product_sales_topic")
                .build();

        kafkaTemplate01.send(message);
    }

    public void sendEventToKafkaCluster(){

        ClickStreamRecord clickStreamRecord = ClickStreamRecord.builder()
                .request("GET /images/track.png HTTP/1.1")
                .status(200)
                .build();

        sendMessage(clickStreamRecord);
    }

    public void sendSalesEventToKafkaCluster(){

        ProductSales sales = ProductSales.builder()
                .price(120.34)
                .productName("Dwat Scalat bag")
                .build();

        sendMessage01(sales);
    }

}
