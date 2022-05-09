package ru.imangali.spring.models;


import javax.validation.constraints.*;

public class Person {
    private int id;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 40, message = "Name should be in range [2, 40]")
    private String name;

    @Min(value = 0, message = "Age should be at least 0")
    @Max(value = 150, message = "Age should not be greater than 150")
    private int age;

    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Not valid email")
    private String email;

    public Person(){

    }

    public Person(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
