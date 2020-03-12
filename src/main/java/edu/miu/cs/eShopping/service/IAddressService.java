package edu.miu.cs.eShopping.service;

import edu.miu.cs.eShopping.model.Address;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface IAddressService {
    List<Address> getAddress();
    Address saveAddress(Address address);
    Optional<Address> findAddressById(long addressId);
    void deleteAddress(Address address);
}
