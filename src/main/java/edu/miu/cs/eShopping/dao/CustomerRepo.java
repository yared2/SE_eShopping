package edu.miu.cs.eShopping.dao;

import edu.miu.cs.eShopping.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long> {
}
