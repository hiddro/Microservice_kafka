package com.example.kafka.listener;

import com.example.kafka.model.Persona;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "test-topic",
    containerFactory = "factory",
    groupId = "test-grupo")
    public void listener(Persona persona){
        System.out.println("Esta data de: "  + persona + " se guardara en la BD!");
    }
}
