package com.example.springbootkafkatutorial.service;

import com.example.springbootkafkatutorial.payload.Student;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaConsumerService {
    public void consume (String message){
        log.info(format("Consuming the message from topic_sample Topic:: %s", message));
    }
    @KafkaListener(topics = "shyam", groupId = "myGroup")
    public void consumeJsonMsg(Student student) {
        log.info(format("Consuming the message from shyam Topic:: %s", student.toString()));
    }
}
