package edu.miu.cs.eShopping.controller;

import java.util.List;

import javax.validation.Valid;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	@PostMapping("/addItem")
	public void addNewCourse(@RequestBody @Valid Item item) {
		itemservice.addItem(item);

	}
	
	@GetMapping("/find")
	public Item findCourseByName(@RequestParam("id") int id) {
		Item  item=	itemservice.findItem(id);
		return item;
	}
	
	

}
