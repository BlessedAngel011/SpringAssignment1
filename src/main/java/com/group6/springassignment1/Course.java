package com.group6.springassignment1;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Course {

    @NotBlank(message = "Category is required")
    private String category;

    @NotBlank(message = "Course name is required")
    private String name;

    @NotBlank(message = "Course code is required")
    private String courseCode;

    @Min(value = 1, message = "Credits must be greater than 0")
    private int credits;

    public Course() {}

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

    public void setCategory(String category) { this.category = category; }
    public void setName(String name) { this.name = name; }
    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }
    public void setCredits(int credits) { this.credits = credits; }
}