package com.codeclan.example.BookingSystem.repositories.CustomerRepository;

import com.codeclan.example.BookingSystem.models.Customer;
import net.bytebuddy.asm.Advice;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {



    @Autowired
    EntityManager entityManager;




    @Transactional
    public List<Customer> getAllCustomersByCourse(Long id){
        List<Customer> result = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria criteria = session.createCriteria(Customer.class);

            criteria.createAlias("bookings", "booking");
            criteria.createAlias("booking.course", "course");

            criteria.add(Restrictions.eq("course.id", id));

            result = criteria.list();
        }
        catch(HibernateException ex) {
            ex.printStackTrace();
        }

        return result;

    }
}
