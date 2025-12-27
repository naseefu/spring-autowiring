package com.autowire.constructor;


public class Car {

    private Specification specification;

    public Car(Specification specification){
        this.specification = specification;
    }

    public void getSpecificationOfCar(){
        System.out.println(specification.toString());
    }

}
