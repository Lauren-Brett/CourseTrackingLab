package com.codeclan.example.BookingSystem.repositories.CustomerRepository;

import com.codeclan.example.BookingSystem.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> getAllCustomersByCourse(Long id);

    List<Customer> getAllCustomersByTownAndCourse(String town, String name);

    List<Customer> getAllCustomersOverAgeByTownAndCourse(int age, String town, String name);

}
