package com.codeclan.example.BookingSystem.controllers;

import com.codeclan.example.BookingSystem.models.Booking;
import com.codeclan.example.BookingSystem.repositories.BookingRepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {
    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/getAllBookingsByDate")
    public List<Booking> getAllBookingsByDate(@RequestParam String date){
        return bookingRepository.getAllBookingsByDate(date);
    }
}
