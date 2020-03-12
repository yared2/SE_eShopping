package edu.miu.cs.eShopping.service.serviceImpl;

import edu.miu.cs.eShopping.dao.CustomerRepo;
import edu.miu.cs.eShopping.model.Customer;
import edu.miu.cs.eShopping.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    public CustomerServiceImpl(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public List<Customer> getCustomers() {
        return customerRepo.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return null;
    }

    @Override
    public Optional<Customer> findCustomerById(long customerId) {
        return Optional.empty();
    }

    @Override
    public void deleteCustomer(long customerId) {
        customerRepo.deleteById(customerId);
    }
}
