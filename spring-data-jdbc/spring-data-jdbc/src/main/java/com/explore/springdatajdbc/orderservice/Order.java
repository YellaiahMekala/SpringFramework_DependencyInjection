package com.explore.springdatajdbc.orderservice;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
//@Table
//@Entity
public class Order {
//    @Id
    private int id;
    private  String name;
    private  int quantity;
    private  double price;


}
