package com.atabek.entities;

public class University {

    // This University class with his private fields and getters, setters and constructor.

    private String name;
    private String city;

    public University(){

    }
    public University(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
