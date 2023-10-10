package com.atabek.entities;

import com.atabek.entities.interfaces.IUniversity;

import java.util.ArrayList;
import java.util.List;

public class Stanford extends University implements IUniversity {
    // This is Stanford class which is extending from his parent class University
    // It has admitStudent() methods where he takes Student object
                                            // and adds to list and print message about admitting
    private List<Student> studentList = new ArrayList<>();
    @Override
    public void admitStudent(Student student) {
        System.out.println("Stanford admitted a student: "+student.getName());
        studentList.add(student);
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
