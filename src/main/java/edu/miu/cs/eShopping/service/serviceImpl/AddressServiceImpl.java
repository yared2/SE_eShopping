package edu.miu.cs.eShopping.service.serviceImpl;

import edu.miu.cs.eShopping.model.Address;
import edu.miu.cs.eShopping.service.IAddressService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements IAddressService {
    @Override
    public List<Address> getAddress() {
        return null;
    }

    @Override
    public Address saveAddress(Address address) {
        return null;
    }

    @Override
    public Optional<Address> findAddressById(long addressId) {
        return Optional.empty();
    }

    @Override
    public void deleteAddress(Address address) {

    }
}
