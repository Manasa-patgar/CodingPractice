package com.example.FoodOrderingApp.controller;

import com.example.FoodOrderingApp.model.Order;
import com.example.FoodOrderingApp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/foodOrderApp/")
public class OrderController
{
    @Autowired
    private final OrderService orderService;

    public OrderController(OrderService orderService)
    {
        this.orderService = orderService;
    }

    @PostMapping(value = "/placeOrder")
    public String createOrder(@RequestBody Order order)
    {
        return orderService.createOrder(order);
    }

    @GetMapping(value = "/viewAllOrders")
    public List<Order> getAllOrders()
    {
        return orderService.getAllOrders();
    }

}
