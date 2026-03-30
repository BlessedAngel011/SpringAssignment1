package com.group6.springassignment1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;

@Controller
public class CourseController {

    @GetMapping("/courses")
    public String getCourses(Model model) {

        List<Course> courses = new ArrayList<>();

        courses.add(new Course("Foundation", "Intro to Programming", "CSC101", 12));
        courses.add(new Course("Foundation", "Computer Literacy", "CSC102", 12));

        courses.add(new Course("Undergraduate", "Data Structures", "CSC201", 15));
        courses.add(new Course("Undergraduate", "Operating Systems", "CSC202", 15));
        courses.add(new Course("Undergraduate", "Database Systems", "CSC203", 15));
        courses.add(new Course("Undergraduate", "Software Engineering", "CSC204", 15));
        courses.add(new Course("Undergraduate", "Networks", "CSC205", 15));

        courses.add(new Course("Honours", "Machine Learning", "CSC401", 20));
        courses.add(new Course("Honours", "Distributed Systems", "CSC402", 20));
        courses.add(new Course("Honours", "Advanced Algorithms", "CSC403", 20));
        courses.add(new Course("Honours", "Cyber Security", "CSC404", 20));

        model.addAttribute("courses", courses);


        return "courses";
    }
}