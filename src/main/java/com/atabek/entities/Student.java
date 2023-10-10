package com.atabek.entities;

public class Student {

    // This is Student class with his private fields and getters, setters.
        // and with some methods and constructor

    private static int studentID = 1;
    private String name;
    private String surname;
    private String group;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        studentID++;
    }

    public Student(String name, String surname, String group) {
        this(name, surname);
        this.group = group;
    }


    public static int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void study(){
        System.out.println(this.name + " is now studying...");
    }

    public void eat(){
        System.out.println(this.name + " is now eating...");
    }

    public void sleep(){
        System.out.println(this.name + " is now sleeping...");
    }
}
