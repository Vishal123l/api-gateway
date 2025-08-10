package com.example.kafka_demo.DemoController.Service;

import com.example.kafka_demo.DemoController.Model.User;
import com.example.kafka_demo.DemoController.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationListener {

    @Autowired
    RegistrationService registrationService;

    public static final String KAFKA_TOPIC="user-topic";

//    @KafkaListener(topics =KAFKA_TOPIC,groupId = "user-group-1")
    public void Listen(User user){
        System.out.println("User registered Successfully: ");
    }

}
