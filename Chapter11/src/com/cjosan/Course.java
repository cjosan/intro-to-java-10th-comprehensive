package com.cjosan;

import java.util.ArrayList;

/**
 * Created by admin on 19.06.2017.
 */
public class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public ArrayList getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        students.remove(student);
    }

    public void clear() {
        students.clear();
    }
}
