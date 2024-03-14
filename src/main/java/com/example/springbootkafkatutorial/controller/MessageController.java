package com.example.springbootkafkatutorial.controller;

import com.example.springbootkafkatutorial.payload.Student;
import com.example.springbootkafkatutorial.service.KafkaJsonProducer;
import com.example.springbootkafkatutorial.service.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
@RequiredArgsConstructor
public class MessageController {
    private final KafkaProducerService kafkaProducer;
    private final KafkaJsonProducer kafkaJsonProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> sendMessage(@RequestBody String message) {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message queued successfully");
    }
    @PostMapping("/json")
    public ResponseEntity<String> sendJsonMessage(@RequestBody Student message) {
        kafkaJsonProducer.sendMessage(message);
        return ResponseEntity.ok("Message queued successfully as JSON");
    }

}
