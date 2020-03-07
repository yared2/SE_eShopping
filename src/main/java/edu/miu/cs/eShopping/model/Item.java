package edu.miu.cs.eShopping.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
public class Item {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int itemId;
	  	private String name;
	  	private int color;
	  	private int weight;
	  	private int price;
	  	
		public Item() {
			super();
		}
	
	
}
