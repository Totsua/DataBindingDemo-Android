package com.northcoders.databindingdemo.model;

public class Person {

    String Name;
    int Age;
    String email;

    public Person() {}

    public Person(String name, int age, String email) {
        Name = name;
        Age = age;
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

