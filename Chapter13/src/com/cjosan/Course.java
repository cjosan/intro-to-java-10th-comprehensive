package com.cjosan;

public class Course implements Cloneable{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        // Left as an exercise in Programming Exercise 10.9
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Course newCourse = (Course) super.clone();
        newCourse.students = students.clone();
        return newCourse;
    }
}
