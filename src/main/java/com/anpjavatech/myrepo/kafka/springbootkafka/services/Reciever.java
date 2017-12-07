package com.anpjavatech.myrepo.kafka.springbootkafka.services;

import com.anpjavatech.myrepo.kafka.springbootkafka.storage.MessageStorage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Reciever {

    private static final Logger LOGGER = LoggerFactory.getLogger(Reciever.class);

    @Autowired
    MessageStorage storage;

    @KafkaListener(topics = "${jsa.kafka.topic}")
    public void processMessage(String content) {
        LOGGER.info("received content = '{}'", content);
        storage.put(content);
    }
}