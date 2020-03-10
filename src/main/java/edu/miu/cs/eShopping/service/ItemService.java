package edu.miu.cs.eShopping.service;

import java.util.List;

import edu.miu.cs.eShopping.model.Item;

public interface ItemService {

	public void addItem(Item item);
	public void deletItem(Item item);
	public List<Item> GetItem();
	public Item findItem(int id);
	
}
