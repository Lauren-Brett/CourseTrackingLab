package com.codeclan.example.BookingSystem.components;

import com.codeclan.example.BookingSystem.models.Booking;
import com.codeclan.example.BookingSystem.models.Course;
import com.codeclan.example.BookingSystem.models.Customer;
import com.codeclan.example.BookingSystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.BookingSystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.BookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Customer customer1 = new Customer("Forest Gump", "Mobil", 32);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Jenny", "Kansas City", 28);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Bubba", "Orange County", 30);
        customerRepository.save(customer3);

        Course course1 = new Course("Indententions 101", "Edinburgh", 5);
        courseRepository.save(course1);

        Course course2 = new Course("Java", "London", 3 );
        courseRepository.save(course2);

        Booking booking1 = new Booking("13/06/2021", customer1, course1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("27/08/3031", customer2, course1);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("12/03/2020", customer2, course2);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("12/03/2020", customer3, course2);
        bookingRepository.save(booking4);

    }

}
