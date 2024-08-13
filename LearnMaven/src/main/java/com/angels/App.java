package com.angels;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
//        create object of the Car class
//        Car car = new Car();
//        car.drive();
//        Bike obj = new Bike();
//        obj.drive();
//       ApplicationContext is an interface
        ApplicationContext context = new ClassPathXmlApplicationContext();
        Vehicle obj = (Vehicle) context.getBean("vehicle");
        obj.drive();


    }
}
