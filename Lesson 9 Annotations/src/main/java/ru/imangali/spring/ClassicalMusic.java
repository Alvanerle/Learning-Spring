package ru.imangali.spring;

import org.springframework.stereotype.Component;

@Component // if not written, id is name of the class with small letter (MyClass -> myClass)
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
