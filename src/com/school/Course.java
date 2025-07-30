package com.school;

public class Course {
private String courseId;
private String courseName;

public Course(String courseId, String courseName) {
    this.courseId = courseId;
    this.courseName = courseName;
}

    public void displayDetails() {
        System.out.println("Course ID: " + this.courseId + ", Name: " + this.courseName);
    }
}