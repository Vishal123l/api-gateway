package com.example.kafka_demo.DemoController.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class User {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
