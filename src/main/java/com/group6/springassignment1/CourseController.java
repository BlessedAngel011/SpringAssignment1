package com.group6.springassignment1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/courses")
public class CourseController {

    private List<Course> courses = new ArrayList<>();

    // READ
    @GetMapping
    public String getCourses(Model model) {
        model.addAttribute("courses", courses);
        model.addAttribute("course", new Course());
        return "courses";
    }

    // CREATE + UPDATE
    @PostMapping
    public String saveCourse(@Valid @ModelAttribute Course course) {

        // UPDATE
        for (Course c : courses) {
            if (c.getCourseCode().equals(course.getCourseCode())) {
                c.setCategory(course.getCategory());
                c.setName(course.getName());
                c.setCredits(course.getCredits());
                return "redirect:/courses";
            }
        }

        // CREATE if new
        courses.add(course);
        return "redirect:/courses";
    }

    // DELETE
    @GetMapping("/delete/{code}")
    public String deleteCourse(@PathVariable String code) {
        courses.removeIf(c -> c.getCourseCode().equals(code));
        return "redirect:/courses";
    }

    // EDIT
    @GetMapping("/edit/{code}")
    public String showEditForm(@PathVariable String code, Model model) {

        for (Course c : courses) {
            if (c.getCourseCode().equals(code)) {
                model.addAttribute("course", c);
                break;
            }
        }

        model.addAttribute("courses", courses);
        return "courses";
    }
}