package ru.amir.spring.dao;

import ru.amir.spring.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    public List<Customer> getCustomers();

    public void saveCustomer(Customer customer);

    public void deleteCustomer(int id);

    public Customer getCustomer(int id);
}
