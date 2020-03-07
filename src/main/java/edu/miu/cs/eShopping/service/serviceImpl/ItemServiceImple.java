package edu.miu.cs.eShopping.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.miu.cs.eShopping.dao.ItemRepo;
import edu.miu.cs.eShopping.model.Item;
import edu.miu.cs.eShopping.service.ItemService;

public class ItemServiceImple  implements ItemService{

	
	private ItemRepo itemrepo;

	@Autowired
	public ItemServiceImple(ItemRepo itemrepo) {
		super();
		
		this.itemrepo = itemrepo;
	}
	
	public void addItem(Item item) {
		itemrepo.save(item);
	}
	public void deletItem(Item item) {
		
		itemrepo.delete(item);
	}
	
	public List<Item> GetItem(){
	return	itemrepo.findAll();
		
	}
	
}
