package com.codeclan.example.BookingSystem.controllers;

import com.codeclan.example.BookingSystem.models.Course;
import com.codeclan.example.BookingSystem.models.Customer;
import com.codeclan.example.BookingSystem.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {
    @Autowired
    CourseRepository courseRepository;






}
