package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- School Attendance System ---");

        Student[] students = new Student[2];

        students[0] = new Student();
        students[0].setDetails(1, "Alice Wonderland");

        students[1] = new Student();
        students[1].setDetails(2, "Bob The Builder");

// Add these imports at the top of the file:
// import java.util.ArrayList;
// import java.util.List;

List<Course> courses = new ArrayList<>();
courses.add(new Course("CS101", "Intro to Programming"));
courses.add(new Course("MA202", "Linear Algebra"));

        System.out.println("\nRegistered Students:");
        for (Student student : students) {
            if (student != null) {
                student.displayDetails();
            }
        }

        System.out.println("\nAvailable Courses:");
        for (Course course : courses) {
            if (course != null) {
                course.displayDetails();
            }
        }
    }
}