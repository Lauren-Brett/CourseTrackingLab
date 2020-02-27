package com.codeclan.example.BookingSystem.repositories.BookingRepository;

import com.codeclan.example.BookingSystem.models.Booking;

import java.util.List;

public interface BookingRepositoryCustom {

    List<Booking> getAllBookingsByDate(String date);
}
