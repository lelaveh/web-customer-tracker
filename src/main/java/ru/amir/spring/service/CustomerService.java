package ru.amir.spring.service;

import ru.amir.spring.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomers();

    public void save(Customer customer);

    public void delete(int id);

    public Customer getCustomer(int id);
}