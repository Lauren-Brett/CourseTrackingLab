package com.codeclan.example.BookingSystem.repositories.BookingRepository;

import com.codeclan.example.BookingSystem.models.Booking;
import com.codeclan.example.BookingSystem.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class BookingRepositoryImpl implements BookingRepositoryCustom {


    @Autowired
    EntityManager entityManager;



}
