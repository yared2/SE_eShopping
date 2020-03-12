package edu.miu.cs.eShopping.model;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    private long addressId;
    private String street;
    private String zipCode;
    private String city;
    private String country;
    private long phoneNumber;
//    @ManyToOne
//    private Customer customer;

    public Address() {
    }

    public Address(String street, String zipCode, String city, String country, long phoneNumber) {
        this.street=street;
        this.zipCode=zipCode;
        this.country=country;
        this.phoneNumber=phoneNumber;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
}
