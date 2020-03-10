package edu.miu.cs.eShopping.service;

import java.util.List;

import edu.miu.cs.eShopping.model.Item;

public interface IBillService {
	public double totalPrice(List<Item>items);

}
