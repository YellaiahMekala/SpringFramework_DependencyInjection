package com.explore.sbScheduler.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "ORDER_DB")
public class Order {
    @Id
    @GeneratedValue
    private  int id;
    private  String name;
    private int quantity;
    private  double price;

    public Order(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
