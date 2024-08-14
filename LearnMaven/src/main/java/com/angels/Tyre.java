package com.angels;

import org.springframework.stereotype.Component;

//@Component
public class Tyre {

    private String brand;

//    using constructor injection
    public Tyre(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

//    using setter injection
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Tyre{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
