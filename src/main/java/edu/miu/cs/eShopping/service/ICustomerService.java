package edu.miu.cs.eShopping.service;

import edu.miu.cs.eShopping.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    List<Customer> getCustomers();
    Customer saveCustomer(Customer customer);
    Optional<Customer> findCustomerById(long customerId);
    void deleteCustomer(long customerId);
}
