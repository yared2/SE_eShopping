package edu.miu.cs.eShopping.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.miu.cs.eShopping.model.Item;
import edu.miu.cs.eShopping.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
	
	private ItemService itemservice;
	
	@GetMapping("/listItem")
	public List<Item> getItem(){
		return itemservice.GetItem();
		
	}
	
	
	
	

}
