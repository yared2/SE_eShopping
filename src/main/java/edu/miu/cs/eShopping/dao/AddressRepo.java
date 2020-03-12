package edu.miu.cs.eShopping.dao;

import edu.miu.cs.eShopping.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address,Long> {
}
