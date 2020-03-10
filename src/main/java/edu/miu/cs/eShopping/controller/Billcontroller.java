package edu.miu.cs.eShopping.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.miu.cs.eShopping.model.Item;
import edu.miu.cs.eShopping.service.serviceImpl.BillserviceImple;

@RestController
@RequestMapping("/bill")
public class Billcontroller {
	
	private BillserviceImple billserviceimple;
	
	
	@GetMapping("/total")
	public double total(@RequestParam("totla") List<Item> items) {
		return  billserviceimple.totalPrice(items);
	}

}
