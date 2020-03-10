package edu.miu.cs.eShopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.miu.cs.eShopping.model.Bill;

public interface billRepo  extends JpaRepository<Bill, Integer>{

}
