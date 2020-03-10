package edu.miu.cs.eShopping.service.serviceImpl;

import java.util.List;

import edu.miu.cs.eShopping.dao.billRepo;
import edu.miu.cs.eShopping.model.Item;
import edu.miu.cs.eShopping.service.IBillService;

public class BillserviceImple  implements IBillService{

	
	private billRepo billrepo;
	@Override
	public double totalPrice(List<Item> items) {
		double total=0.0;
	for(Item item:items) {
		total+=item.getPrice();
	}
		return total;
	
	

}
}