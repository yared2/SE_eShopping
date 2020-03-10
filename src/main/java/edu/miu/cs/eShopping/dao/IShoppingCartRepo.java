package edu.miu.cs.eShopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.miu.cs.eShopping.model.ShoppingCart;

public interface IShoppingCartRepo extends JpaRepository<ShoppingCart, Integer> {

}
