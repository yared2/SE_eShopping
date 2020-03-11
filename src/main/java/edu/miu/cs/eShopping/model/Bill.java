package edu.miu.cs.eShopping.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="bills")
public class Bill {
	@Id
	@GeneratedValue
	private int billNumer;
	private User user;
	@OneToMany(mappedBy="items")
	private List<Item> items;

    public Bill() {
    }

    public int getBillNumer() {
 		return billNumer;
 	}

    
    public Bill(User user, List<Item> items) {
        this.user = user;
        this.items = items;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

   
    
  

	
}
