package edu.miu.cs.eShopping.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String orderId;
    @Column(name = "order_number")
    private Number orderNumber;
    @Column(name = "order_date")
    private LocalDate orderDate;
//    @ManyToOne
//    private List<Item> items = new ArrayList<>();

    public Order() {
    }
    public Order(Number orderNumber,LocalDate orderDate) {
        this.orderNumber=orderNumber;
        this.orderDate= orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Number getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Number orderNumber) {
        this.orderNumber = orderNumber;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

//    public List<Item> getItems() {
//        return items;
//    }
//
//    public void setItems(List<Item> items) {
//        this.items = items;
//    }
}
