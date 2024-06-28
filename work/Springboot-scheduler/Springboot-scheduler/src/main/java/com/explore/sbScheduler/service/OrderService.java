package com.explore.sbScheduler.service;

import com.explore.sbScheduler.model.Order;
import com.explore.sbScheduler.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @PostConstruct
    public void initDataDB() {
        List<Order> orders = IntStream.rangeClosed(1, 20)
                .mapToObj(i -> new Order("order" + i, new Random().nextInt(5), new Random().nextDouble())).collect(Collectors.toList());
        orderRepository.saveAll(orders);

    }

    public  Order saveOrder(Order order){
        return  orderRepository.save(order);
    }

}
