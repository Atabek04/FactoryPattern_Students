package com.atabek.factories;

import com.atabek.entities.Student;

public class StudentFactory {
    // This is a factory class for creating Student objects
    public Student createStudent(String name, String surname) {
        return new Student(name, surname);
    }
}
