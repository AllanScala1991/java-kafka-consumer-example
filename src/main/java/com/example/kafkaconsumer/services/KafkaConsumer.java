package com.example.kafkaconsumer.services;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

//método anotado com @KafkaListener para receber as mensagens do Kafka
@Component
public class KafkaConsumer {
    @KafkaListener(topics = "topic1")
    public void receive(ConsumerRecord<?, ?> consumerRecord) {
        System.out.println(consumerRecord);
    }
}
