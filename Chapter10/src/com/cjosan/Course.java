package com.cjosan;

/**
 * Created by admin on 19.06.2017.
 */
public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;

        if (numberOfStudents == students.length) {
            String[] newStudents = new String[students.length * 2];
            System.arraycopy(students, 0, newStudents, 0, numberOfStudents);
            students = newStudents;
        }
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
        for (int i = 0; i < students.length; i++) {
            if (student.equals(students[i])) {
                students[i] = null;
                String[] newStudents = new String[students.length];
                System.arraycopy(students, 0, newStudents, 0, i);
                System.arraycopy(students, i + 1, newStudents, i, students.length - (i + 1));
                students = newStudents;
                numberOfStudents--;
            }
        }
    }

    public void clear() {
        for (int i = 0; i < students.length; i++) {
            students[i] = null;
        }
    }
}
