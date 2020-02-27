package com.codeclan.example.BookingSystem;

import com.codeclan.example.BookingSystem.models.Course;
import com.codeclan.example.BookingSystem.models.Customer;
import com.codeclan.example.BookingSystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.BookingSystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.BookingSystem.repositories.CustomerRepository.CustomerRepository;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BookingSystemApplicationTests {


	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void getAllCoursesRating(){
		List<Course> found = courseRepository.findCourseByRating(5);
		assertEquals("Indententions 101", found.get(0).getName());
	}
//
//	@Test
//	public void getCustomerForGivenCourse(){
//		List<Customer> found = customerRepository.findCustomerByCourse("Java");
//		assertEquals("Buba", found.get(0).getName());
//	}

}
