package com.codeclan.example.BookingSystem.repositories.CustomerRepository;

import com.codeclan.example.BookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
    List<Customer> getAllCustomersByCourse(Long id);
    List<Customer> getAllCustomersByTownAndCourse(String town, String name);
    List<Customer> getAllCustomersOverAgeByTownAndCourse(int age, String town, String name);
}
