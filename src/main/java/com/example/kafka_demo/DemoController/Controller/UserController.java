package com.example.kafka_demo.DemoController.Controller;

import com.example.kafka_demo.DemoController.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    RegistrationService registrationService;

    @PostMapping("/registerAll")
    public String userRegistration(){
//        registrationService.registerAllUser();
        return "User successfully Registered";
    }

    @GetMapping("/")
    public String helloService(){
        return "Hii Vishal";
    }


}
