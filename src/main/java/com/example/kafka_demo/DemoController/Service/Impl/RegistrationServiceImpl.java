package com.example.kafka_demo.DemoController.Service.Impl;

import com.example.kafka_demo.DemoController.Model.User;
import com.example.kafka_demo.DemoController.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService{

//    @Autowired
//    private KafkaTemplate<String,User> kafkaTemplate;

    public static final String KAFKA_TOPIC="user-topic";

    @Override
    public void registerAllUser() {
        User user = new User();
        for(int i=0; i<1000;i++){
            user.setName("name"+String.valueOf(i));
//            kafkaTemplate.send(KAFKA_TOPIC,user);
            System.out.println("Registration Initiated");
        }
    }
}
