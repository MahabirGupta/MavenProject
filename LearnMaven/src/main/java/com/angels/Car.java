package com.angels;

import org.springframework.stereotype.Component;

@Component //as the annotation
public class Car implements Vehicle {

//    create a drive method
    public void drive(){
        System.out.println("Car is moving");
    }
}
