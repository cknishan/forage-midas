package com.example.midascore;

import com.example.midascore.foundation.Transaction;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private final KafkaTemplate<String, Transaction> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, Transaction> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(Transaction transaction) {
        kafkaTemplate.send("transactions-topic", transaction);
    }
}