package com.atabek.entities;

import com.atabek.entities.interfaces.IUniversity;

import java.util.ArrayList;
import java.util.List;

public class AITU extends University implements IUniversity {

    // This is AITU class which is extending from his parent class University
    // It has admitStudent() methods where he takes Student object
    // and adds to list and print message about admitting

    private List<Student> studentList = new ArrayList<>();

    public AITU(String name, String city) {
        super(name, city);
    }

    public AITU(String name) {
        super(name);
    }

    public AITU(){

    }

    @Override
    public void admitStudent(Student student) {
        System.out.println("AITU admitted a student: "+student.getName());
        studentList.add(student);
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
