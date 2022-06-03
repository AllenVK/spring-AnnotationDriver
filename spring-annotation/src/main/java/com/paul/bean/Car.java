package com.paul.bean;

import org.springframework.stereotype.Component;

/**
 * @Project: spring-AnnotationDriver
 * @Desc: // describe the class information
 * @Date: 2022-06-03 15:02
 * @Author: Paul
 */
@Component
public class Car {

    public Car(){
        System.out.println("car constructor...");
    }

    public void init(){
        System.out.println("car ... init...");
    }

    public void detory(){
        System.out.println("car ... detory...");
    }

}
