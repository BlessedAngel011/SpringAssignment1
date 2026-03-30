package com.group6.springassignment1;

public class Course {
    private String category;
    private String name;
    private String courseCode;
    private int credits;

    public Course(String category, String name, String courseCode, int credits) {
        this.category = category;
        this.name = name;
        this.courseCode = courseCode;
        this.credits = credits;
    }

    public String getCategory() { return category; }
    public String getName() { return name; }
    public String getCourseCode() { return courseCode; }
    public int getCredits() { return credits; }
}