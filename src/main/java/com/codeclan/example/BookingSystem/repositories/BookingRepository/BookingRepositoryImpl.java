package com.codeclan.example.BookingSystem.repositories.BookingRepository;

import com.codeclan.example.BookingSystem.models.Booking;
import com.codeclan.example.BookingSystem.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class BookingRepositoryImpl implements BookingRepositoryCustom {


    @Autowired
    EntityManager entityManager;


    @Transactional
    public List<Booking> getAllBookingsByDate(String date){
        List<Booking> result = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria criteria = session.createCriteria(Booking.class);
            criteria.add(Restrictions.eq("date", date));

            result = criteria.list();

        }

        catch(HibernateException ex) {
            ex.printStackTrace();
        }

        return result;
    }


}
