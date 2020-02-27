package com.codeclan.example.BookingSystem.repositories.CourseRepository;

import com.codeclan.example.BookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

}
