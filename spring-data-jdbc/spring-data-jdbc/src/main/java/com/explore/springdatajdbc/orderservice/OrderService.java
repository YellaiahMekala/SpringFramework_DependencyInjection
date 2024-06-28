package com.explore.springdatajdbc.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private  OrderRepository orderRepository;
    public  Order saveOrder(Order order){
        return null;
    }
}
