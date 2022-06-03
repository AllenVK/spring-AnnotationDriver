package com.paul.config;

import com.paul.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Project: spring-AnnotationDriver
 * @Desc: // describe the class information
 * @Date: 2022-06-03 15:15
 * @Author: Paul
 */
@ComponentScan("com.paul.bean")
@Configuration
public class MainConfigOfLifeCycle {

    //@Scope("prototype")
    @Bean(initMethod="init",destroyMethod="detory")
    public Car car(){
        return new Car();
    }

}
