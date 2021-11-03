package com.example.FoodOrderingApp.dao;

import com.example.FoodOrderingApp.model.Order;

import java.util.List;
import java.util.UUID;

public interface OrderDao
{
    int createOrder(String id, Order order);

    default int createOrder(Order order)
    {
        String id = UUID.randomUUID().toString();
        return createOrder(id, order);
    }

    List<Order> getAllOrders();
}
