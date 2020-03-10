package edu.miu.cs.eShopping.model;

import java.util.List;

public class Bill {

    private User user;
    private List<Item> items;

    public Bill() {
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
