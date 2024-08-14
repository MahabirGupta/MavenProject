package com.angels;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //as the annotation
public class Car implements Vehicle {

//    create object of Tyre and add the @Autowired annotation
    @Autowired
    private Tyre tyre;

//    getter and setter for tyre object


    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    //    create a drive method
    public void drive(){
        System.out.println("Car is moving " + tyre);
    }
}
