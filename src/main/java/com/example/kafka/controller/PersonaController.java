package com.example.kafka.controller;

import com.example.kafka.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/persona")
public class PersonaController {

//    @Value("${kafka.consumer.topic}")
//    private String topico;

    @Autowired
    private KafkaTemplate<String, Persona> kafkaTemplate;

    @PostMapping
    public void publicarPersona(@RequestBody Persona persona){
        kafkaTemplate.send("test-topic", persona);
    }
}
