package ru.amir.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.amir.spring.entity.Customer;

import java.util.List;

@Repository
@Component
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Customer order by lastName", Customer.class).getResultList();
    }

    @Override
    public void saveCustomer(Customer customer) {
        sessionFactory.getCurrentSession().saveOrUpdate(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        Session session = sessionFactory.getCurrentSession();
        Customer customer = session.get(Customer.class, id);
        sessionFactory.getCurrentSession().delete("Customer", customer);
    }

    @Override
    public Customer getCustomer(int id) {
        return sessionFactory.getCurrentSession().get(Customer.class, id);
    }
}
