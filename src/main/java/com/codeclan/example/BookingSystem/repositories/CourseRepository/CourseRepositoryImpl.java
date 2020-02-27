package com.codeclan.example.BookingSystem.repositories.CourseRepository;

import com.codeclan.example.BookingSystem.models.Course;
import com.codeclan.example.BookingSystem.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepositoryCustom {


    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Course> getAllCoursesForGivenCustomer(Long id){
        List<Course> result = null;
        Session session = entityManager.unwrap(Session.class);

        try{
            Criteria criteria = session.createCriteria(Course.class);

            criteria.createAlias("bookings", "booking");
            criteria.createAlias("booking.customer", "customer");

            criteria.add(Restrictions.eq("customer.id", id));

            result = criteria.list();
        }
        catch(HibernateException ex) {
            ex.printStackTrace();
        }

        return result;


    }



}
