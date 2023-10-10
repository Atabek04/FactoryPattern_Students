package com.atabek;


import com.atabek.entities.University;
import com.atabek.entities.interfaces.IUniversity;
import com.atabek.factories.StudentFactory;
import com.atabek.factories.UniversityFactory;

public class Main {
    public static void main(String[] args) {
//        Creating factories objects
        StudentFactory studentFactory = new StudentFactory();
        UniversityFactory universityFactory = new UniversityFactory();

//        Creating university
        IUniversity aitu = universityFactory.createUniversity("AITU");
        IUniversity stanford =  universityFactory.createUniversity("Stanford");

//        Admitting students
        aitu.admitStudent(studentFactory.createStudent("Ali", "Hamza"));
        stanford.admitStudent(studentFactory.createStudent("Umar", "Ayub"));
    }
}