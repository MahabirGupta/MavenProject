package com.angels;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{

//    create a ride method
    public void drive(){
        System.out.println("Riding a bike");
    }
}
