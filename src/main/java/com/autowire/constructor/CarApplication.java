package com.autowire.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationAutowiringByConstructor.xml");
        Car car = (Car) context.getBean("myCar");
        car.getSpecificationOfCar();
    }
}
