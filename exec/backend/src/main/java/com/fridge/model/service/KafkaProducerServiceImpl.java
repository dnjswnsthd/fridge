package com.fridge.model.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fridge.model.dto.MessageDto;

@Service
public class KafkaProducerServiceImpl implements KafkaProducerService{
    private static final String TOPIC = "exam";
    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Autowired
    public KafkaProducerServiceImpl(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(MessageDto message) throws IOException{
        System.out.println(String.format("Produce message : %s", message));
        this.kafkaTemplate.send(TOPIC, message);
    }
}