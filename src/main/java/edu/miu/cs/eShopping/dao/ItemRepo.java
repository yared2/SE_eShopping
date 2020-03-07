package edu.miu.cs.eShopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.miu.cs.eShopping.model.Item;

public interface ItemRepo extends JpaRepository<Item, Integer> {

	
}
