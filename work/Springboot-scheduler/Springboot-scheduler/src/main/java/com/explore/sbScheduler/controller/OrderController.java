package com.explore.sbScheduler.controller;

import com.explore.sbScheduler.model.Order;
import com.explore.sbScheduler.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/orders")
    public Order saveOrder(@RequestBody Order order){
        return  orderService.saveOrder(order);
    }

}
