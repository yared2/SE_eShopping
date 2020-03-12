package edu.miu.cs.eShopping.controller;

import edu.miu.cs.eShopping.dao.CustomerRepo;
import edu.miu.cs.eShopping.model.Customer;
import edu.miu.cs.eShopping.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customer", produces = {MediaType.APPLICATION_JSON_VALUE})
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    /**
     * This method returns list of customers
     *
     * @return listOfCustomers
     */
    @GetMapping("/list")
    public List<Customer> getAllCustomers() {
        return iCustomerService.getCustomers();
    }

    /**
     * This method records a customer information to the database.
     */
    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return iCustomerService.saveCustomer(customer);
    }

    /**
     * This method updates the customer information in the database with the new
     * information provided.
     *
     * @return updatedCustomer
     */
    @PutMapping("/editCustomer/{customerId}")
    public Customer updateCustomerInfo(@RequestBody Customer customer, @PathVariable long customerId) {
        return iCustomerService.findCustomerById(customerId)
                .map(cust -> {
                    cust.setFirstName(customer.getFirstName());
                    cust.setMiddleName(customer.getMiddleName());
                    cust.setLastName(customer.getLastName());
                    cust.setPhoneNumber(customer.getPhoneNumber());
                    return iCustomerService.saveCustomer(cust);
                }).orElseGet(() -> {
                    customer.setCustomerId(customerId);
                    return iCustomerService.saveCustomer(customer);
                });
    }

    /**
     * This method deleted the selected customer
     */
    @DeleteMapping("/deleteCustomer/{customerId}")
    void deleteCustomerInfo(@PathVariable long customerId) {
        iCustomerService.deleteCustomer(customerId);
    }

}
