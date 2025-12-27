package com.autowire.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired // this is field injection
    @Qualifier("specification") // i want this type of bean with this name
    private Specification specification;


    /*
    @Autowired // this is constructor injection
    public Car(Specification specification){
        this.specification = specification;
    }*/

    public void getSpecificationOfCar(){
        System.out.println(specification.toString());
    }

}
