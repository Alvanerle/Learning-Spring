package ru.imangali.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class ClassicalMusic implements Music {

    @PostConstruct
    public void init(){
        System.out.println("Initializing object");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroying object");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
