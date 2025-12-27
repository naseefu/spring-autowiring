package com.autowire.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("specification")
public class Specification {

    @Value("M5")
    private String model;
    @Value("BMW")
    private String make;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                '}';
    }
}
